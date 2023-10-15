package com.akilincarslan.askmeai.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.akilincarslan.askmeai.R
import com.akilincarslan.askmeai.core.BaseInjectionActivity
import com.akilincarslan.askmeai.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseInjectionActivity<ActivityMainBinding,MainViewModel>() {

    override fun getLayoutRes(): Int = R.layout.activity_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
    }
    private fun initBinding() {
        navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
        setupActionBar()
        binding.bottomNavView.setOnItemSelectedListener {
            navController.navigate(it.itemId)
            return@setOnItemSelectedListener true
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id) {}
        }
    }

    private fun setupActionBar() {
        val appBarConfig = AppBarConfiguration(
            setOf(R.id.homeFragment,R.id.historyFragment,R.id.settingsFragment)
        )
        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController,appBarConfig)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}