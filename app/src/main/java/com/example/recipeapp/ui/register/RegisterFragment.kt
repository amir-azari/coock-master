package com.example.recipeapp.ui.register

import android.os.Bundle
import android.util.Log
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
            bgImg.load(R.drawable.login_bg)

            // Set up text watchers

            usernameEdt.doAfterTextChanged { validateUsername(it.toString()) }
            passwordEdt.doAfterTextChanged { validatePassword(it.toString()) }
            nameEdt.doAfterTextChanged { validateFirstName(it.toString()) }
            lastNameEdt.doAfterTextChanged { validateLastName(it.toString()) }

            nameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, lastNameEdt)
            }

            lastNameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, usernameEdt)
            }

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
                val firstName = nameEdt.text.toString()
                val lastName = lastNameEdt.text.toString()
                val username = usernameEdt.text.toString()
                val password = passwordEdt.text.toString()

                if (validateFields(firstName, lastName, username) &&
                    validateUsername(username) &&
                    validatePassword(password) &&
                    validateFirstName(firstName) &&
                    validateLastName(lastName)
                ) {
                    // Set up the body for the API call
                    body.password = password
                    body.firstName = firstName
                    body.lastName = lastName
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

    private fun validateFields(firstName: String, lastName: String, username: String): Boolean {
        return firstName.isNotEmpty() && lastName.isNotEmpty() && username.isNotEmpty()
    }
    private fun validateFirstName(firstName: String): Boolean {
        val nameRegex = "^[^\\d@\$].*"
        return if (firstName.isNotEmpty()) {
            if (firstName.length >= 3 && firstName.matches(nameRegex.toRegex())) {
                binding.nameTxtLay.isErrorEnabled = false
                true
            } else {
                binding.nameTxtLay.error = getString(R.string.firstNameNotValid)
                false
            }
        } else {
            binding.nameTxtLay.isErrorEnabled = false
            false
        }
    }

    private fun validateLastName(lastName: String): Boolean {
        val nameRegex = "^[^\\d@\$].*"
        return if (lastName.isNotEmpty()) {
            if (lastName.length >= 3 && lastName.matches(nameRegex.toRegex())) {
                binding.lastNameTxtLay.isErrorEnabled = false
                true
            } else {
                binding.lastNameTxtLay.error = getString(R.string.lastNameNotValid)
                false
            }
        } else {
            binding.lastNameTxtLay.isErrorEnabled = false
            false
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
        viewModel.registerData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    // Handle loading state
                }

                is NetworkRequest.Success -> {
                    response.data?.data?.let { data ->

                        viewModel.saveData(data.username!!)
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
