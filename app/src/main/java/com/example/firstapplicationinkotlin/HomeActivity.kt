package com.example.firstapplicationinkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {

   private lateinit var welcomeTextView:TextView
   private lateinit var edtUsername: EditText
   private lateinit var edtPassword:EditText
   private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        welcomeTextView = findViewById(R.id.welcomeTextView)
        edtPassword = findViewById(R.id.edtPassword)
        edtUsername = findViewById(R.id.edtUsername)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        if(view == btnLogin){
            if(edtUsername.text.toString()=="sandip"
                && edtPassword.text.toString()=="1234"){
                    welcomeTextView.text = "Welcome Sandip"
                }else{
                   Toast.makeText(this,"Login Unsuccessful!",Toast.LENGTH_LONG).show()
                }
        }
    }

}