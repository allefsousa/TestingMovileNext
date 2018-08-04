package com.example.allef.next.movilenext_loginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btlogin.setOnClickListener {
            val email = etEmail.text.toString()

            if (email == ("admin@admin.com")){
                tvStatus.text = "Allef sousa santos"
            }else{
                tvStatus.text = "Login failed."
            }
        }



    }
}
