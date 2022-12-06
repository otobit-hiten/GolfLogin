package com.example.golflogin

data class LoginResponse(
    val data: Data,
    val success: Boolean
){
    data class Data(
        val accessToken: String,
        val refreshToken: String,
        val user: User
    )

    data class User(
        val birthdate: String,
        val createdAt: String,
        val email: Any,
        val gender: String,
        val id: Int,
        val isLocked: Boolean,
        val lastActivity: Any,
        val lastLogin: String,
        val name: String,
        val phoneNumber: String,
        val role: Role
    )
    data class Role(
        val createdAt: String,
        val id: Int,
        val name: String
    )
}