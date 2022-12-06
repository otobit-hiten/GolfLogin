package com.example.golflogin

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface Api {

    @POST("auth/login")
        fun login(
        @Field("phoneNumber") phoneNumber: String,
        @Field("pin") pin: String) : Call<LoginResponse>
}