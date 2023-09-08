package com.example.bharatpricer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // After 3 seconds, automatically navigate to the login or register page
        Handler().postDelayed({
            // Start the Login or Register activity here
            val loginIntent = Intent(this@HomeActivity, LoginActivity::class.java)
            startActivity(loginIntent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
