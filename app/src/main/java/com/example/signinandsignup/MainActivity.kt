package com.example.signinandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main_signIN.setOnClickListener {
            var intent =Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)

            //This is test for GitHub
        }
        button_main_signUP.setOnClickListener {
            var intent=Intent(applicationContext,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
