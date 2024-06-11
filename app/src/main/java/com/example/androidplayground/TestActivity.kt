package com.example.androidplayground

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navContainer) as NavHostFragment
        findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(navHostFragment.navController)
    }

}
