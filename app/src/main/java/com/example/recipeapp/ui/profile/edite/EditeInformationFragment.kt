package com.example.recipeapp.ui.profile.edite

import android.os.Bundle
import android.util.Log
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
import com.example.recipeapp.databinding.FragmentEditeInformationBinding
import com.example.recipeapp.databinding.FragmentLoginBinding
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.EditeInfoViewModel
import com.example.recipeapp.viewmodel.LoginViewModel
import com.example.recipeapp.viewmodel.ProfileViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class EditeInformationFragment : BottomSheetDialogFragment() {
    // Binding
    private var _binding: FragmentEditeInformationBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var body: BodyEditeInfo

    @Inject
    lateinit var networkChecker: NetworkChecker

    @Inject
    lateinit var sessionManager: SessionManager

    //Other
    private var oldUsername = ""
    private val editeInfoViewModel: EditeInfoViewModel by viewModels()
    private val profileViewModel: ProfileViewModel by viewModels()
    private var newUsername = ""
    private var newFirstname = ""
    private var newLastname = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentEditeInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {

            profileViewModel.readProfileStoredItems.asLiveData().onceObserve(viewLifecycleOwner){
                oldUsername = it.username
                usernameEdt.setText(it.username)
                lastNameEdt.setText(it.lastname)
                nameEdt.setText(it.firstname)
            }
            // Set up text watchers
            usernameEdt.doAfterTextChanged { validateUsername(it.toString()) }
            nameEdt.doAfterTextChanged { validateFirstName(it.toString()) }
            lastNameEdt.doAfterTextChanged { validateLastName(it.toString()) }

            nameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, lastNameEdt)
            }

            lastNameEdt.setOnEditorActionListener { _, actionId, _ ->
                handleEditorAction(actionId, usernameEdt)
            }

            usernameEdt.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    submitBtn.performClick()
                    true
                } else {
                    false
                }
            }

            submitBtn.setOnClickListener {
                val firstName = nameEdt.text.toString()
                val lastName = lastNameEdt.text.toString()
                val username = usernameEdt.text.toString()

                if (validateFields(firstName, lastName, username) &&
                    validateUsername(username) &&
                    validateFirstName(firstName) &&
                    validateLastName(lastName)
                ) {
                    // Set up the body for the API call
                    body.firstName = firstName
                    body.lastName = lastName
                    body.username = username

                    // Check network connectivity
                    lifecycleScope.launch {
                        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                            networkChecker.checkNetworkAvailability().collect { state ->
                                if (state) {
                                    newUsername = username
                                    newLastname = lastName
                                    newFirstname = firstName
                                    editeInfoViewModel.callRegisterApi(oldUsername,body)
                                } else {
                                    root.showSnackBar(getString(R.string.checkConnection))
                                }
                            }
                        }
                    }
                }else {
                    Toast.makeText(requireContext() , R.string.fillRequiredFields , Toast.LENGTH_SHORT).show()
                }
            }
        }
        loadRegisterData()
    }



    private fun loadRegisterData() {
        editeInfoViewModel.editeData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    // Handle loading state
                }

                is NetworkRequest.Success -> {
                    response.data?.data?.let { data ->
                        profileViewModel.saveToStore(newUsername , newFirstname , newLastname)
                        lifecycleScope.launch{

                            sessionManager.saveToken(newUsername)
                        }
                        findNavController().navigate(R.id.actionRecipeFragmentToProfileFragment)

                    }
                }

                is NetworkRequest.Error -> {

                    Toast.makeText(requireContext() , response.message , Toast.LENGTH_SHORT).show()
                }
            }
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