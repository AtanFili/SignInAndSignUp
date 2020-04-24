package com.example.signinandsignup

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        button_Login.setOnClickListener {
            if (edit_text_login.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter your Log", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (edit_text_password.text.isEmpty()) {
                    Toast.makeText(
                        applicationContext, "Please Enter Correct Password", Toast.LENGTH_SHORT).show()

                } else {
                    var intent = Intent(applicationContext, Welcome::class.java)
                    startActivity(intent)
                }
            }


        }
    }

}

