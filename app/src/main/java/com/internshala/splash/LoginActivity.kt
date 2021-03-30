package com.internshala.splash

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    lateinit var etLoginPageMobileNumber: EditText
    lateinit var etLoginPagePassword:EditText
    lateinit var btnLogin:Button
    lateinit var txtforgotPassword:TextView
    lateinit var txtSignUpNow:TextView
    val validMobileNumber="0123456789"
    val validPassword="fries"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title="Login to Splash"

        etLoginPageMobileNumber=findViewById(R.id.etLoginPageMobileNumber)
        etLoginPagePassword=findViewById(R.id.etLoginPagePassword)
        btnLogin=findViewById(R.id.btnLogin)
        txtforgotPassword=findViewById(R.id.txtforgotPassword)
        txtSignUpNow=findViewById(R.id.txtSignUpNow)

        btnLogin.setOnClickListener {
            val intent= Intent(this@LoginActivity, LoginCredentials::class.java)
            val loginMobileNumber=etLoginPageMobileNumber.text.toString()
            val loginPassword=etLoginPagePassword.text.toString()
           if(loginMobileNumber==validMobileNumber && loginPassword==validPassword){
               intent.putExtra("loginMobileNumber", loginMobileNumber)
               intent.putExtra("loginPassword", loginPassword)
               startActivity(intent)
           }
            else{
                etLoginPageMobileNumber.text.clear()
                etLoginPagePassword.text.clear()
                Toast.makeText(this@LoginActivity, "Incorrect Credentials", Toast.LENGTH_SHORT).show()
           }
        }

        txtforgotPassword.setOnClickListener {
            val intentForgotPassword=Intent(this@LoginActivity, ForgotPassword::class.java)
            startActivity(intentForgotPassword)
        }

        txtSignUpNow.setOnClickListener {
            val intentSignUpNow=Intent(this@LoginActivity, Registration::class.java)
            startActivity(intentSignUpNow)
        }
    }

    override fun onResume() {
        super.onResume()
        etLoginPageMobileNumber.text.clear()
        etLoginPagePassword.text.clear()
    }

}