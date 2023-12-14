package com.example.recipeapp.ui.register

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.recipeapp.R
import com.example.recipeapp.databinding.FragmentRegisterBinding
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    // Binding
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var body: BodyRegister

    @Inject
    lateinit var networkChecker: NetworkChecker

    // ViewModel
    private val viewModel: RegisterViewModel by viewModels()

    // Other
    private var email: String = ""
    private var username: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            coverImg.load(R.drawable.register_logo)
            bgImg.load(R.drawable.bg_splash)

            // Set up text watchers
            emailEdt.doAfterTextChanged { validateEmail(it.toString()) }
            usernameEdt.doAfterTextChanged { validateUsername(it.toString()) }

            nameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, lastNameEdt)
            }

            lastNameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, usernameEdt)
            }

            usernameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, emailEdt)
            }

            emailEdt.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    submitBtn.performClick()
                    true
                } else {
                    false
                }
            }

            // Click listener for the submit button
            submitBtn.setOnClickListener {
                val firstName = nameEdt.text.toString()
                val lastName = lastNameEdt.text.toString()
                val username = usernameEdt.text.toString()

                if (validateFields(firstName, lastName, username) &&
                    validateUsername(username) &&
                    validateEmail(email)
                ) {
                    // Set up the body for the API call
                    body.email = email
                    body.firstName = firstName
                    body.lastName = lastName
                    body.username = username

                    // Check network connectivity
                    lifecycleScope.launch {
                        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                            networkChecker.checkNetworkAvailability().collect { state ->
                                if (state) {
                                    // Call the API
                                    viewModel.callRegisterApi(Constants.MY_API_KEY, body)
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

    private fun validateEmail(email: String): Boolean {
        return if (email.isNotEmpty()) {
            val pattern = Patterns.EMAIL_ADDRESS
            if (pattern.matcher(email).matches()) {
                this.email = email
                binding.emailTxtLay.isErrorEnabled = false
                true
            } else {
                binding.emailTxtLay.error = getString(R.string.emailNotValid)
                false

            }
        } else {
            binding.emailTxtLay.isErrorEnabled = false
            false

        }
    }

    private fun validateFields(firstName: String, lastName: String, username: String): Boolean {
        return firstName.isNotEmpty() && lastName.isNotEmpty() && username.isNotEmpty() && email.isNotEmpty()
    }

    private fun validateUsername(username: String): Boolean {
        return if (username.isNotEmpty()) {
            this.username = username
            if (username.length in 4..16) {
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

    private fun loadRegisterData() {
        viewModel.registerData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    // Handle loading state
                }

                is NetworkRequest.Success -> {
                    response.data?.let { data->
                        viewModel.saveData(data.username.toString(), data.hash.toString())
                        findNavController().popBackStack(R.id.registerFragment, true)
                        findNavController().navigate(R.id.actionToRecipe)
                    }
                }

                is NetworkRequest.Error -> {
                    binding.root.showSnackBar(response.message!!)
                }
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