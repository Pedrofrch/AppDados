package com.example.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.loginuser.LoginViewModel
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mLoginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.mLoginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.button.setOnClickListener{
            val textUser = findViewById<EditText>(R.id.editTextEmailAddress)
            val textPassword = findViewById<EditText>(R.id.editTextPassword)
            val user = textUser.text.toString()
            val password = textPassword.text.toString()
            checkUsers(user, password)
        }
    }

    private fun checkUsers(user:String, password: String){
        if(mLoginViewModel.checkUsers(user, password) === true){
            startActivity(Intent(this, InsertData::class.java))
        }else{
            Toast.makeText(this, "Dados incorretos", Toast.LENGTH_LONG).show();
        }
    }
}