package com.example.recipeapp.ui.steps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.adapter.StepsAdapter
import com.example.recipeapp.databinding.FragmentStepsBinding
import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.setupRecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class StepsFragment : BottomSheetDialogFragment() {
    //Binding
    private var _binding: FragmentStepsBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var stepsAdapter: StepsAdapter

    //Other
    private val args: StepsFragmentArgs by navArgs()
    private lateinit var steps: MutableList<ResponseDetail.AnalyzedInstruction.Step>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentStepsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            closestBtn.setOnClickListener {
                dismiss()
            }
            //Args
            args.let {
                steps = it.data.steps!!.toMutableList()
                if (steps.isNotEmpty()) {
                    Constants.STEPS_COUNT = steps.size
                    stepsAdapter.setData(steps)
                    stepsList.setupRecyclerView(LinearLayoutManager(requireContext()), stepsAdapter)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}