package com.internshala.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPassword : AppCompatActivity() {

    lateinit var etForgotPasswordPageMobileNumber:EditText
    lateinit var etForgotPasswordPageEmailAddress:EditText
    lateinit var btnForgotPasswordPageNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        title="Forgot Password"

        etForgotPasswordPageEmailAddress=findViewById(R.id.etForgotPasswordPageEmailAddress)
        etForgotPasswordPageMobileNumber=findViewById(R.id.etForgotPasswordPageMobileNumber)
        btnForgotPasswordPageNext=findViewById(R.id.btnForgotPasswordPageNext)



        btnForgotPasswordPageNext.setOnClickListener {

            val mobileNumber=etForgotPasswordPageMobileNumber.text.toString()
            val emailAddress=etForgotPasswordPageEmailAddress.text.toString()

            if(mobileNumber.isNotEmpty() && emailAddress.isNotEmpty()){
                val intent= Intent(this@ForgotPassword,ForgotPasswordsCredentials::class.java)
                intent.putExtra("ForgotPasswordMobileNumber",mobileNumber)
                intent.putExtra("ForgotPasswordEmailAddress",emailAddress)
                startActivity(intent)
            }
            else{
                etForgotPasswordPageEmailAddress.text.clear()
                etForgotPasswordPageMobileNumber.text.clear()
                Toast.makeText(this@ForgotPassword,"Please enter the credentials",Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onRestart() {
        super.onRestart()
        val intent1=Intent(this@ForgotPassword,LoginActivity::class.java)
        startActivity(intent1)
    }
}