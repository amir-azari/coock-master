package com.example.recipeapp.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.recipeapp.R
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.databinding.FragmentSplashBinding
import com.example.recipeapp.viewmodel.LoginViewModel
import com.example.recipeapp.viewmodel.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : Fragment() {

    @Inject
    lateinit var sessionManager: SessionManager

    // Binding
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    //Other
    private val registerViewModel: RegisterViewModel by viewModels()
    private val loginViewModel: LoginViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitView
        binding.apply {
            //Dynamically background
            bgImg.load(R.drawable.login_bg)
            //Application version
            versionTxt.text = "${getString(R.string.version)} : 1.0"

            lifecycleScope.launch {
                viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
                    delay(2500)
                    // Check user info
                    val token = sessionManager.getToken.first()
                    findNavController().popBackStack(R.id.splashFragment, true)
                    if (token != null && token.isNotEmpty()) {
                        findNavController().navigate(R.id.actionToRecipe)
                    } else {
                        findNavController().navigate(R.id.actionToRegister)

                    }
                }

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}