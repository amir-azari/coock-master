package com.example.recipeapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.recipeapp.R
import com.example.recipeapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import io.github.inflationx.viewpump.ViewPumpContextWrapper

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Binding
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    //Other
    private lateinit var navHost : NavHostFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Setup navHost
        navHost = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        binding.mainBottomNav.background = null
        binding.mainBottomNav.setupWithNavController(navHost.navController)
        //Nav controller
        navHost = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        //Gone bottom nav
        navHost.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment -> visibilityBottomMenu(false)
                R.id.registerFragment -> visibilityBottomMenu(false)
                R.id.detailFragment -> visibilityBottomMenu(false)
                R.id.webViewFragment -> visibilityBottomMenu(false)
                R.id.loginFragment -> visibilityBottomMenu(false)
                R.id.profileFragment -> visibilityBottomMenu(false)
                else -> visibilityBottomMenu(true)

            }
        }
        //Menu
        binding.mainFabMenu.setOnClickListener {
            val currentFragmentId = navHost.navController.currentDestination?.id

            if (currentFragmentId == R.id.recipeFragment) {
                navHost.navController.navigate(R.id.actionToMenu)
            }
            if (currentFragmentId == R.id.searchFragment) {
                navHost.navController.navigate(R.id.actionToSearchMenu)
            }
            if (currentFragmentId == R.id.luckyFragment) {

                navHost.navController.navigate(R.id.actionToLuckyMenu)
            }
        }
    }

    override fun onNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onNavigateUp()
    }


    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }
    private fun visibilityBottomMenu(isVisibility : Boolean){
        binding.apply {
            if (isVisibility){
                mainBottomAppbar.isVisible = true
                mainFabMenu.isVisible = true
            }else {
                mainBottomAppbar.isVisible = false
                mainFabMenu.isVisible = false
            }
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
