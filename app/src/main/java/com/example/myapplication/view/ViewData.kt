package com.example.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityViewDataBinding
import com.example.myapplication.model.DataMock

class ViewData : AppCompatActivity() {

    private lateinit var binding: ActivityViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddData.setOnClickListener {next()}

        pushData()
    }

    private fun next() {
        startActivity(Intent(this, InsertData::class.java))
    }

    private fun pushData() {
        val userData = intent.getSerializableExtra("data") as DataMock
        binding.textPhone.text = userData.phone
        binding.textEmail.text = userData.email
    }
}
