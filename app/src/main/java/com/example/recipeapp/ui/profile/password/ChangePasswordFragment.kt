package com.example.recipeapp.ui.profile.password

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.recipeapp.R
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.databinding.FragmentChangePasswordBinding
import com.example.recipeapp.databinding.FragmentEditeInformationBinding
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.profile.BodyPassword
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.ChangePasswordViewModel
import com.example.recipeapp.viewmodel.EditeInfoViewModel
import com.example.recipeapp.viewmodel.ProfileViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ChangePasswordFragment : BottomSheetDialogFragment() {
    // Binding
    private var _binding: FragmentChangePasswordBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var body: BodyPassword

    @Inject
    lateinit var networkChecker: NetworkChecker

    private val changePasswordViewModel: ChangePasswordViewModel by viewModels()
    private val profileViewModel: ProfileViewModel by viewModels()
    private var username = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentChangePasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {

            profileViewModel.readProfileStoredItems.asLiveData().onceObserve(viewLifecycleOwner) {
                username = it.username
            }
            // Set up text watchers

            oldPassEdt.doAfterTextChanged { validatePassword(it.toString()) }
            passwordEdt.doAfterTextChanged { validatePassword(it.toString()) }

            oldPassEdt.setOnEditorActionListener { _, actionId, _ ->
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
            submitBtn.setOnClickListener {
                val oldPass = oldPassEdt.text.toString()
                val newPass = passwordEdt.text.toString()

                if (validateFields(oldPass, newPass)
                ) {
                    // Set up the body for the API call
                    body.oldPassword = oldPass
                    body.newPassword = newPass

                    // Check network connectivity
                    lifecycleScope.launch {
                        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                            networkChecker.checkNetworkAvailability().collect { state ->
                                if (state) {
                                    changePasswordViewModel.callRegisterApi(username, body)
                                } else {
                                    Toast.makeText(
                                        requireContext(),
                                        R.string.checkConnection,
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        R.string.fillRequiredFields,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        loadData()

    }

    private fun loadData() {
        changePasswordViewModel.data.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    // Handle loading state
                }

                is NetworkRequest.Success -> {


                    findNavController().popBackStack(R.id.profileFragment, true)
                    findNavController().navigate(R.id.actionToProfileFragment)



                }

                is NetworkRequest.Error -> {

                    Toast.makeText(requireContext(), response.message, Toast.LENGTH_SHORT).show()
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

    private fun validateFields(oldPass: String, newPass: String): Boolean {
        return oldPass.isNotEmpty() && newPass.isNotEmpty()
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}