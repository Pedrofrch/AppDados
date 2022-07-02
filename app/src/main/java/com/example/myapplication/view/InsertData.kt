package com.example.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityInsertDataBinding
import com.example.myapplication.model.DataMock

class InsertData : AppCompatActivity() {
    private lateinit var binding: ActivityInsertDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInsertDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {saveData()}
    }

    private fun saveData() {
        val phone = binding.editTextPhone.text.toString()
        val email = binding.editTextEmail.text.toString()

        val userData = DataMock(phone, email)

        val intent = Intent(this, ViewData::class.java)
        intent.putExtra("data", userData)

        startActivity(intent)
    }
}