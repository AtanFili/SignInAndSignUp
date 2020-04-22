package com.example.signinandsignup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        button_Login.setOnClickListener {
            var intent= Intent(applicationContext,SignInLoginSc::class.java)
            startActivity(intent)
        }
        button_password.setOnClickListener {
            var intent= Intent(applicationContext,SignInPasswordScreen::class.java)
            startActivity(intent)
        }
        button_signIn.setOnClickListener {
            var intent= Intent(applicationContext,LogInSignINscreen::class.java)
            startActivity(intent)
        }
        forgotenpass.setOnClickListener {
            var intent= Intent(applicationContext,ForgotenPassLoginScren::class.java)
            startActivity(intent)
        }
        signupbottomtextview.setOnClickListener {
            var intent= Intent(applicationContext,SignUploginScreen::class.java)
            startActivity((intent))
        }
    }
}


