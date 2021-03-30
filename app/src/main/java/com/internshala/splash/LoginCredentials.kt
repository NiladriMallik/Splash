package com.internshala.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginCredentials : AppCompatActivity() {

    lateinit var txtLoginCredentialMobile:TextView
    lateinit var txtLoginCredentialPassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_credentials)

        title="Your Credentials"

        txtLoginCredentialMobile=findViewById(R.id.txtLoginCredentialMobile)
        txtLoginCredentialPassword=findViewById(R.id.txtLoginCredentialPassword)

        val loginMobileNumber:String=intent.getStringExtra("loginMobileNumber").toString()
        val loginPassword:String=intent.getStringExtra("loginPassword").toString()

        txtLoginCredentialMobile.text= "Mobile number: \n$loginMobileNumber"
        txtLoginCredentialPassword.text= "Password: \n$loginPassword"
    }
}