package com.example.loginuser

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    fun checkUsers (user: String, password: String): Boolean{
        val user = UsersMock().getUserByEmail(user)
        if(user.isNotEmpty()) {
            if (user[0].password == password) {
                return true
            }
        }
        return false
    }
}