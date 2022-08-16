package io.mawulikwashigahazameti.jiji

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.mawulikwashigahazameti.jiji.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setupWithNavController(navController)


        bottomNav.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
                }
                R.id.action_messages -> {
                    Toast.makeText(this, "message", Toast.LENGTH_SHORT).show()
                }
                R.id.action_sell -> {
                    Toast.makeText(this, "sell", Toast.LENGTH_SHORT).show()
                }
            }
        }


    }
}