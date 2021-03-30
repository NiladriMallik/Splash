package com.internshala.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ForgotPasswordsCredentials : AppCompatActivity() {

    lateinit var etShowForgotPasswordMobileNumber:TextView
    lateinit var etShowForgotPasswordEmailAddress:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_passwords_credentials)

        title="Recover User Credentials"

        etShowForgotPasswordEmailAddress=findViewById(R.id.etShowForgotPasswordEmailAddress)
        etShowForgotPasswordMobileNumber=findViewById(R.id.etShowForgotPasswordMobileNumber)

        val mobileNumber:String=intent.getStringExtra("ForgotPasswordMobileNumber").toString()
        val emailAddress:String=intent.getStringExtra("ForgotPasswordEmailAddress").toString()

        etShowForgotPasswordMobileNumber.text= "Mobile Number: \n$mobileNumber"
        etShowForgotPasswordEmailAddress.text= "Email address: \n$emailAddress"
    }
}