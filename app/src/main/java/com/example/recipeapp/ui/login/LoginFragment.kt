package com.example.recipeapp.ui.login

import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.text.set
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.recipeapp.R
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.databinding.FragmentLoginBinding
import com.example.recipeapp.databinding.FragmentRegisterBinding
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.LoginViewModel
import com.example.recipeapp.viewmodel.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class LoginFragment : Fragment() {
    // Binding
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var body: BodyLogin

    @Inject
    lateinit var networkChecker: NetworkChecker

    @Inject
    lateinit var sessionManager: SessionManager

    // ViewModel
    private val viewModel: LoginViewModel by viewModels()

    // Other
    private var username: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            bgImg.load(R.drawable.login_bg)

            val registerSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    // Navigate to the registration screen
                    findNavController().popBackStack(R.id.registerFragment, true)
                    findNavController().navigate(R.id.actionToRegister)
                }
            }

            // Set up a SpannableString for the TextView
            val spannable = SpannableString(getString(R.string.don_t_have_a_account_register))
            spannable[spannable.length - "Register".length until spannable.length+1] = registerSpan

            // Set the SpannableString to the TextView
            Sing.text = spannable
            Sing.movementMethod = LinkMovementMethod.getInstance()

            // Set up text watchers

            usernameEdt.doAfterTextChanged { validateUsername(it.toString()) }
            passwordEdt.doAfterTextChanged { validatePassword(it.toString()) }

            usernameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, passwordEdt)
            }

            passwordEdt.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    submitBtn.performClick()
                    true
                } else {
                    false
                }
            }
            // Click listener for the submit button
            submitBtn.setOnClickListener {
                val username = usernameEdt.text.toString()
                val password = passwordEdt.text.toString()

                if (validateUsername(username) && validatePassword(password)) {
                    // Set up the body for the API call
                    body.password = password
                    body.username = username

                    // Check network connectivity
                    lifecycleScope.launch {
                        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                            networkChecker.checkNetworkAvailability().collect { state ->
                                if (state) {
                                    // Call the API
                                    viewModel.callRegisterApi(body)
                                } else {
                                    root.showSnackBar(getString(R.string.checkConnection))
                                }
                            }
                        }
                    }

                } else {
                    root.showSnackBar(getString(R.string.fillRequiredFields))
                }
            }
            // Load register data
            loadRegisterData()
        }
    }

    private fun validateUsername(username: String): Boolean {
        return if (username.isNotEmpty()) {
            this.username = username
            if (username.length in 4..24 && !username.matches("^[0-9@\$].*".toRegex())) {
                binding.usernameTxtLay.isErrorEnabled = false
                true
            } else {
                binding.usernameTxtLay.error = getString(R.string.usernameNotValid)
                false
            }
        } else {
            binding.usernameTxtLay.isErrorEnabled = false
            false
        }
    }

    private fun validatePassword(password: String): Boolean {
        return if (password.isNotEmpty()) {
            if (password.length >= 8) {
                binding.passwordTxtLay.isErrorEnabled = false
                true
            } else {
                binding.passwordTxtLay.error = getString(R.string.passwordTooShort)
                false
            }
        } else {
            binding.passwordTxtLay.isErrorEnabled = false
            false
        }
    }
    private fun loadRegisterData() {
        viewModel.loginData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    // Handle loading state
                }

                is NetworkRequest.Success -> {
                    response.data?.data.let { data ->
                        if (data!!.username!!.isNotEmpty()){
                            lifecycleScope.launch{

                                sessionManager.saveToken(data.username!!)
                                findNavController().popBackStack(R.id.registerFragment, true)
                                findNavController().navigate(LoginFragmentDirections.actionToRecipe())
                            }


                        }


                    }
                }

                is NetworkRequest.Error -> {
                    binding.root.showSnackBar(response.message!!)
                }

                else -> {}
            }
        }
    }

    private fun handleEditorAction(actionId: Int, nextField: View): Boolean {
        return when (actionId) {
            EditorInfo.IME_ACTION_NEXT -> {
                nextField.requestFocus()
                true
            }

            else -> false
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

