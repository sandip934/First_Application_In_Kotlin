package com.example.firstapplicationinkotlin

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.utils.StopLogic
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   lateinit var mainContainer : LinearLayout
   lateinit var welcomeMessageTextView : TextView
   lateinit var usernameEditText : EditText
   lateinit var passwordEditText: EditText
   lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mainContainer = LinearLayout(this)
        mainContainer.setPadding(20,20,20,20)
        mainContainer.gravity = Gravity.CENTER
        mainContainer.orientation = LinearLayout.VERTICAL

        val linearLayoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        mainContainer.layoutParams = linearLayoutParams

        val layoutParamsForViews = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )



        welcomeMessageTextView = TextView(this)
        welcomeMessageTextView.setText("Welcome To Bitcode For Android!")
        welcomeMessageTextView.setTextColor(Color.BLACK)
        welcomeMessageTextView.setTextSize(20.0f)
        welcomeMessageTextView.setPadding(20,20,20,20)
        welcomeMessageTextView.layoutParams = layoutParamsForViews

        mainContainer.addView(welcomeMessageTextView)

        usernameEditText = EditText(this)
        usernameEditText.setHint("Enter Username")
        usernameEditText.layoutParams = layoutParamsForViews

        mainContainer.addView(usernameEditText)

        passwordEditText = EditText(this)
        passwordEditText.setHint("Enter Password")
        passwordEditText.layoutParams = layoutParamsForViews

        mainContainer.addView(passwordEditText)

        btnLogin = Button(this)
        btnLogin.setText("Login")
        btnLogin.setPadding(20,20,20,20)
        btnLogin.setBackgroundColor(Color.CYAN)
        btnLogin.setTextColor(Color.BLACK)
        btnLogin.setTextSize(20.0f)
        btnLogin.layoutParams = layoutParamsForViews

        btnLogin.setOnClickListener(MyBtnLoginClickListener())
        mainContainer.addView(btnLogin)

        setContentView(mainContainer)
        Toast.makeText(this,"onCreate Method is Called",Toast.LENGTH_LONG).show()
    }

    inner class MyBtnLoginClickListener : View.OnClickListener {
        override fun onClick(view: View) {
            if (view == btnLogin) {
                if ((usernameEditText.text.toString().equals("Bitcode"))
                    && (passwordEditText.text.toString().equals("Bitcode@1234"))
                ) {

                    Toast.makeText(this@MainActivity, "Login Button is Clicked", Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Method is Called",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Method is Called",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Method is Called",Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Method is Called",Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Method is Called",Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart Method is Called",Toast.LENGTH_LONG).show()
    }
}
