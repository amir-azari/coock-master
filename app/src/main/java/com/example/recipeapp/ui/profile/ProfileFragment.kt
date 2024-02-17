package com.example.recipeapp.ui.profile

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.room.Room
import com.example.recipeapp.R
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.data.database.RecipeAppDatabase
import com.example.recipeapp.databinding.FragmentProfileBinding
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.viewmodel.LuckyMenuViewModel
import com.example.recipeapp.viewmodel.MenuViewModel
import com.example.recipeapp.viewmodel.ProfileViewModel
import com.example.recipeapp.viewmodel.SearchMenuViewModel
import com.example.recipeapp.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
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



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.apply {
            editeBtn.setOnClickListener {
                findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToEditeFragment())
            }
            changePassBtn.setOnClickListener {
                findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToChnagePasswordFragment())
            }
            logoutBtn.setOnClickListener {
                val builder = AlertDialog.Builder(requireContext())
                builder.setTitle("Log out")
                    .setMessage("Are you sure you can log out???")
                    .setPositiveButton("Yes") { _, _ ->
                        findNavController().navigate(R.id.registerFragment)
                        lifecycleScope.launch {
                            sessionManager.logout()
                            sessionManager.clearToken()
                        }
                    }
                    .setNegativeButton("No") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .show()
            }



            viewModel.readProfileStoredItems.asLiveData().onceObserve(viewLifecycleOwner) {
                usernameTxt.text = "@${it.username}"
                fNamelNameTxt.text = "${it.firstname} ${it.lastname}"
            }
        }

    }
    private fun clearDatabase() {
        val db = Room.databaseBuilder(
            requireContext(),
            RecipeAppDatabase::class.java, "recipe_app_database"
        ).build()

        // Clear all tables in the database
        db.clearAllTables()
        db.close()
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}