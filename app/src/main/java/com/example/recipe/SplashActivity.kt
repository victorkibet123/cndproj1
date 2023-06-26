package com.example.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        fun onPostCreate(savedInstanceState: Bundle?) {
            super.onPostCreate(savedInstanceState)

            // Start the main activity.
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            supportActionBar?.hide()
            Handler().postDelayed({

                val i = Intent(
                    this@SplashActivity,
                    SplashActivity::class.java
                )

                startActivity(i)


                finish()
            }, 2000)

        }
    }
}


