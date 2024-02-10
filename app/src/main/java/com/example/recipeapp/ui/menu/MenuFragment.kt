package com.example.recipeapp.ui.menu

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
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

                Log.d("Meal List" , it.meal)
                Log.d("Meal List" , it.mealId.toString())
                Log.d("Meal List" , it.diet)
                Log.d("Meal List" , it.dietId.toString())
                Log.d("Meal List" , it.cuisine)
                Log.d("Meal List" , it.cuisineID.toString())

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
            //Sorting chips - click
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
                }
            }

            //Order chips - click
            orderChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                var chip: Chip
                checkedIds.forEach {
                    chip = group.findViewById(it)
                    if (chip.text.toString().lowercase() == "ascending"){
                        chipOrderTitle = "asc"
                    }else if (chip.text.toString().lowercase() == "descending"){
                        chipOrderTitle = "desc"

                    }
                    chipOrderId = it
                }
                if (checkedIds.isEmpty()) {
                    chipOrderTitle = ""
                    chipOrderId = 0
                }
            }

            //Submit
            //Check Internet
            submitBtn.setOnClickListener {
                lifecycleScope.launchWhenStarted {
                    networkChecker.checkNetworkAvailability().collect { state ->
                        if (state){
                            viewModel.saveToStore(chipMealTitle, chipMealId, chipDietTitle, chipDietId ,chipCuisineTitle , chipCuisineId , chipSortingTitle , chipSortingId , chipOrderTitle , chipOrderId)
                            findNavController().navigate(MenuFragmentDirections.actionMenuToRecipe().setIsUpdateData(true))
                        } else {
                            Toast.makeText(requireContext(), "No internet connection", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
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


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}