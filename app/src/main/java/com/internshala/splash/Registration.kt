package com.internshala.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registration : AppCompatActivity() {

   lateinit var etRegistrationPageName: EditText
   lateinit var etEmailAddress:EditText
   lateinit var etRegistrationMobileNumber:EditText
   lateinit var etRegistrationAddress:EditText
   lateinit var etRegistrationPassword:EditText
   lateinit var etRegistrationConfirmPassword:EditText
   lateinit var btnRegister:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        title="Register Yourself"

        etRegistrationPageName=findViewById(R.id.etRegistrationPageName)
        etEmailAddress=findViewById(R.id.etEmailAddress)
        etRegistrationMobileNumber=findViewById(R.id.etRegistrationMobileNumber)
        etRegistrationAddress=findViewById(R.id.etRegistrationAddress)
        etRegistrationPassword=findViewById(R.id.etRegistrationPassword)
        etRegistrationConfirmPassword=findViewById(R.id.etRegistrationConfirmPassword)
        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val registrationName=etRegistrationPageName.text.toString()
            val registrationEmailAddress=etEmailAddress.text.toString()
            val registrationMobileNumber=etRegistrationMobileNumber.text.toString()
            val registrationAddress=etRegistrationAddress.text.toString()
            val registrationPassword=etRegistrationPassword.text.toString()
            val registrationConfirmPassword=etRegistrationConfirmPassword.text.toString()
            val fieldsFilled=registrationName.isNotEmpty() &&
                    registrationEmailAddress.isNotEmpty() &&
                    registrationMobileNumber.isNotEmpty() &&
                    registrationAddress.isNotEmpty()&&
                    registrationPassword.isNotEmpty()&&
                    registrationConfirmPassword==registrationPassword
            val passwordsMatch=registrationPassword==registrationConfirmPassword


            if(fieldsFilled){
                val intent= Intent(this@Registration,RegistrationCredentials::class.java)
                intent.putExtra("Registration Name",registrationName)
                intent.putExtra("Registration Email Address",registrationEmailAddress)
                intent.putExtra("Registration Mobile",registrationMobileNumber)
                intent.putExtra("Registration Address",registrationAddress)
                intent.putExtra("Registration Password",registrationPassword)
                startActivity(intent)
            }

            else if(!fieldsFilled){
                if(passwordsMatch){
                    Toast.makeText(this@Registration,"Please enter all credentials",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this@Registration,"Please enter all credentials properly",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onRestart() {
        super.onRestart()
        val intent2=Intent(this@Registration,LoginActivity::class.java)
        startActivity(intent2)
    }
}