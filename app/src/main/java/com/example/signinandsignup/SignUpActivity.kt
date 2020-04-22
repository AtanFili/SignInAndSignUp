package com.example.signinandsignup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_up_activity.*

class SignUpActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_activity)

        button_firstname.setOnClickListener {
            var intent=Intent(applicationContext,SignUpScreenFirstName::class.java)
            startActivity(intent)
        }

        button_email.setOnClickListener {
            var intent=Intent(applicationContext,EmailAddressScreen::class.java)
            startActivity(intent)
        }

        button_yourlogin.setOnClickListener {
            var intent=Intent(applicationContext,YourLoginScreen::class.java)
            startActivity(intent)
        }
        button_yourpassword.setOnClickListener {
            var intent=Intent(applicationContext,YourPasswordScreen::class.java)
            startActivity(intent)
        }
        button_signup_down.setOnClickListener {
            var intent=Intent(applicationContext,SignUpScreenDown::class.java)
            startActivity(intent)
        }
        subscribe.setOnClickListener {
            var intent=Intent(applicationContext,SignUpSubscribe::class.java)
            startActivity(intent)
        }
    }
}