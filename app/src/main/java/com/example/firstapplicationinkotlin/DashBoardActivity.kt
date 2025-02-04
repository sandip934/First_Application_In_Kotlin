package com.example.firstapplicationinkotlin

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashBoardActivity: AppCompatActivity() {

    private lateinit var resources: Resources
    private lateinit var welcomeMessage: String
    private lateinit var userName: String
    private lateinit var coloure: Array<String>
    private lateinit var names: Array<String>
    private lateinit var numbers: IntArray
    private lateinit var rollNumbers: IntArray
    private var colourBlue: Int = 0
    private var dimensionWidth: Float = 0.0F

    private lateinit var textView: TextView
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        resources = resources
        textView = findViewById(R.id.txtView)
        btnLogin = findViewById(R.id.btnLogin)

        welcomeMessage = resources.getString(R.string.welcome_message)
        userName = resources.getString(R.string.user_name)
        coloure = resources.getStringArray(R.array.colours)
        names = resources.getStringArray(R.array.names)
        numbers = resources.getIntArray(R.array.numbers)
        rollNumbers = resources.getIntArray(R.array.roll_numbers)
        colourBlue = resources.getColor(R.color.blue)
        dimensionWidth = resources.getDimension(R.dimen.width)

        for (colour in coloure) {
            Log.e("Tag", colour)
        }

        for (rollNumber in rollNumbers) {
            Log.e("Tag", rollNumber.toString())
        }

        btnLogin.setOnClickListener {
            Toast.makeText(this, "Login Button is Clicked", Toast.LENGTH_LONG).show()
        }
    }

    inner class MyBtnLoginClickListener : View.OnClickListener {
        override fun onClick(view: View) {
            Toast.makeText(this@DashBoardActivity, "Login Button is Clicked", Toast.LENGTH_LONG)
                .show()
        }
    }
}