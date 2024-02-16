package com.example.recipeapp.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.recipeapp.R
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.databinding.FragmentProfileBinding
import com.example.recipeapp.databinding.FragmentRecipeBinding
import com.example.recipeapp.ui.recipe.RecipeFragmentArgs
import com.example.recipeapp.ui.recipe.RecipeFragmentDirections
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.ProfileViewModel
import com.example.recipeapp.viewmodel.RecipeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject
@AndroidEntryPoint
class ProfileFragment : Fragment() {

    //Binding
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var sessionManager: SessionManager

    //Other
    private val viewModel: ProfileViewModel by viewModels()
    private val args: ProfileFragmentArgs by navArgs()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.apply {
            editeBtn.setOnClickListener {
                findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToEditeFragment())
            }

            viewModel.readProfileStoredItems.asLiveData().onceObserve(viewLifecycleOwner){
                usernameTxt.text = "@${it.username}"
                fNamelNameTxt.text = "${it.firstname} ${it.lastname}"
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}