package com.ahmetutlu.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class nextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent= intent
        val userName=intent.getStringExtra("username")
        val name=intent.getStringExtra("name")

        userNameTextActivity.text="Username:$userName"
        nameTextActivity.text="Name:$name"
    }
}