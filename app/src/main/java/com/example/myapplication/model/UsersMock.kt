package com.example.loginuser

data class User(val id: String, val login: String, val password: String)

class UsersMock {

    private var userList = listOf(
        User("1","pedro", "123" ),
        User("2","flavio", "123" )
    )

    fun getUserByEmail(email: String): List<User> {
        return userList.filter { it.login == email }
    }
}