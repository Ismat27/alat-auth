package com.example.wemaauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ForgetPasswordActivity : AppCompatActivity() {

    private lateinit var navigateBackButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        initializeView()

    }

    private fun initializeView() {
        navigateBackButton = findViewById(R.id.goto_back)
        navigateBackButton.setOnClickListener{
            finish()
        }
    }
}