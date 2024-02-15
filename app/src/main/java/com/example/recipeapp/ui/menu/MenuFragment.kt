package com.example.recipeapp.ui.menu

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.recipeapp.R
import com.example.recipeapp.databinding.FragmentMenuBinding
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.MenuViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.chip.ChipGroup
import com.google.android.material.slider.Slider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MenuFragment : BottomSheetDialogFragment() {
    //Binding
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var networkChecker: NetworkChecker

    //Other
    private lateinit var viewModel: MenuViewModel
    private lateinit var isSortingSelectedLiveData: MutableLiveData<Boolean>

    private var chipCounter = 1

    private var chipMealTitle = ""
    private var chipMealId = 0

    private var chipDietTitle = ""
    private var chipDietId = 0

    private var chipCuisineTitle = ""
    private var chipCuisineId = 0

    private var chipSortingTitle = ""
    private var chipSortingId = 0

    private var chipOrderTitle = ""
    private var chipOrderId = 0

    private var hourValue = 0
    private var minValue = 0

    private var isSortingChipClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MenuViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        isSortingSelectedLiveData = MutableLiveData(false)
        binding.HourSlider.isEnabled = false
        binding.MinSlider.isEnabled = false

        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            //Fill chips
            setupChip(viewModel.cuisineList(), cuisineChipGroup)
            setupChip(viewModel.mealsList(), mealChipGroup)
            setupChip(viewModel.dietsList(), dietChipGroup)
            setupChip(viewModel.sortingList(), sortingChipGroup)
            setupChip(viewModel.orderList(), orderChipGroup)


            viewModel.readMenuStoredItems.asLiveData().onceObserve(viewLifecycleOwner) {
                chipMealTitle = it.meal
                chipDietTitle = it.diet
                chipCuisineTitle = it.cuisine
                chipSortingTitle = it.sorting
                chipOrderTitle = it.order

                updateChip(it.cuisineID, cuisineChipGroup)
                updateChip(it.mealId, mealChipGroup)
                updateChip(it.dietId, dietChipGroup)
                updateChip(it.sortingID, sortingChipGroup)
                updateChip(it.orderID, orderChipGroup)

                updateSlider(it.hourValue, binding.HourSlider)
                updateSlider(it.minValue, binding.MinSlider)

            }
            //Meal chips - click
            mealChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    chipMealTitle = chip.text.toString().lowercase()
                    chipMealId = it
                }
                if (checkedIds.isEmpty()) {
                    chipMealTitle = ""
                    chipMealId = 0
                }
            }
            //Diet chips - click
            dietChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    chipDietTitle = chip.text.toString().lowercase()
                    chipDietId = it
                }
                if (checkedIds.isEmpty()) {
                    chipDietTitle = ""
                    chipDietId = 0
                }
            }
            //Cuisine chips - click
            cuisineChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    chipCuisineTitle = chip.text.toString()
                    chipCuisineId = it
                }
                if (checkedIds.isEmpty()) {
                    chipCuisineTitle = ""
                    chipCuisineId = 0
                }
            }
            // Sorting chips - click
            sortingChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    chipSortingTitle = chip.text.toString().lowercase()
                    chipSortingId = it
                }
                if (checkedIds.isEmpty()) {
                    chipSortingTitle = ""
                    chipSortingId = 0
                    isSortingSelectedLiveData.value = false
                } else {
                    isSortingSelectedLiveData.value = true
                }
                orderChipGroup.isEnabled = isSortingSelectedLiveData.value ?: false
                orderChipGroup.clearCheck()

                // Check if "time" is selected
                if (isSortingSelectedLiveData.value == true && chipSortingTitle == "time") {
                    binding.HourSlider.isEnabled = true
                    binding.MinSlider.isEnabled = true
                } else {
                    binding.HourSlider.isEnabled = false
                    binding.MinSlider.isEnabled = false

                }
            }
            MaxReadyTime.setOnClickListener {
                showSortingTimeDialog()

            }

            //Order chips - click
            orderChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                if (isSortingSelectedLiveData.value != true) {
                    group.clearCheck()
                    return@setOnCheckedStateChangeListener
                }

                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    if (chip.text.toString().lowercase() == "ascending") {
                        chipOrderTitle = "asc"
                    } else if (chip.text.toString().lowercase() == "descending") {
                        chipOrderTitle = "desc"
                    }
                    chipOrderId = it
                }
                if (checkedIds.isEmpty()) {
                    chipOrderTitle = ""
                    chipOrderId = 0
                }
            }

            //slider hour
            HourSlider.addOnChangeListener {  slider, value, fromUser ->
                if (isSortingSelectedLiveData.value == true && chipSortingTitle == "time") {
                    binding.HourSlider.isEnabled = true
                    hourValue = value.toInt()
                }else{
                    binding.HourSlider.isEnabled = false

                }
            }
            //slider min
            MinSlider.addOnChangeListener {  slider, value, fromUser ->
                if (isSortingSelectedLiveData.value == true && chipSortingTitle == "time") {
                    binding.MinSlider.isEnabled = true
                    minValue = value.toInt()
                }else{
                    binding.MinSlider.isEnabled = false
                }

            }
            //Submit
            //Check Internet
            submitBtn.setOnClickListener {
                lifecycleScope.launchWhenStarted {
                    networkChecker.checkNetworkAvailability().collect { state ->
                        if (state){
                            viewModel.saveToStore(chipMealTitle, chipMealId, chipDietTitle, chipDietId ,chipCuisineTitle , chipCuisineId , chipSortingTitle , chipSortingId , chipOrderTitle , chipOrderId , hourValue, minValue)
                            findNavController().navigate(MenuFragmentDirections.actionMenuToRecipe().setIsUpdateData(true))
                        } else {
                            Toast.makeText(requireContext(), "No internet connection", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
    private fun showSortingTimeDialog() {
        val builder = AlertDialog.Builder(requireContext())
            .setMessage("Please select item (Time) from Sorting to enable sliders.")
            .setPositiveButton("OK") { _, _ ->
                // Handle OK button click
            }
            .setCancelable(false)
            .create()
            .show()
    }
    private fun setupChip(list: MutableList<String>, view: ChipGroup) {
        list.forEach {
            val chip = Chip(requireContext())
            val drawable = ChipDrawable.createFromAttributes(requireContext(), null, 0, R.style.DarkChip)
            chip.setChipDrawable(drawable)
            chip.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            chip.id = chipCounter++
            chip.text = it
            view.addView(chip)
        }
    }

    private fun updateChip(id: Int, view: ChipGroup) {
        val chip = view.findViewById<Chip>(id)
        chip?.isChecked = true
    }
    private fun updateSlider(value: Int, slider: Slider) {
        slider.value = value.toFloat()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}