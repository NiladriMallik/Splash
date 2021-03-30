package com.internshala.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistrationCredentials : AppCompatActivity() {

    lateinit var txtRegistrationCredentialsName:TextView
    lateinit var txtRegistrationCredentialsEmailAddress:TextView
    lateinit var txtRegistrationCredentialsMobile:TextView
    lateinit var txtRegistrationCredentialsDeliveryAddress:TextView
    lateinit var txtRegistrationCredentialsPassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_credentials)

        title="Your Credentials"

        txtRegistrationCredentialsName=findViewById(R.id.txtRegistrationCredentialsName)
        txtRegistrationCredentialsEmailAddress=findViewById(R.id.txtRegistrationCredentialsEmailAddress)
        txtRegistrationCredentialsMobile=findViewById(R.id.txtRegistrationCredentialsMobile)
        txtRegistrationCredentialsDeliveryAddress=findViewById(R.id.txtRegistrationCredentialsDeliveryAddress)
        txtRegistrationCredentialsPassword=findViewById(R.id.txtRegistrationCredentialsPassword)

        val registrationName:String=intent.getStringExtra("Registration Name").toString()
        val registrationEmailAddress:String=intent.getStringExtra("Registration Email Address").toString()
        val registrationMobile:String=intent.getStringExtra("Registration Mobile").toString()
        val deliveryAddress:String=intent.getStringExtra("Registration Address").toString()
        val registrationPassword:String=intent.getStringExtra("Registration Password").toString()

        txtRegistrationCredentialsName.text= "Name: \n$registrationName"
        txtRegistrationCredentialsEmailAddress.text="Email: \n$registrationEmailAddress"
        txtRegistrationCredentialsMobile.text="Mobile No.: \n$registrationMobile"
        txtRegistrationCredentialsDeliveryAddress.text="Address: \n$deliveryAddress"
        txtRegistrationCredentialsPassword.text="Password: \n$registrationPassword"
    }
}