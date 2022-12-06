package com.example.golflogin

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun logindetail(phoneNumber:String,pin:String) : MutableLiveData<Resource<LoginResponse>>{
        val mutableLiveData : MutableLiveData<Resource<LoginResponse>> = MutableLiveData()

        val call : Call<LoginResponse>? = ApiClient.apiService?.login(phoneNumber,pin)

        call?.enqueue(object : Callback<LoginResponse?> {
            override fun onResponse(
                call: Call<LoginResponse?>,
                response: Response<LoginResponse?>
            ) {
                val responseModel: LoginResponse?=response.body()
                if (responseModel != null) {
                    mutableLiveData.postValue(Resource.success(responseModel))
                }
            }

            override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
                mutableLiveData.postValue(Resource.error("Something went Wrong", null))
            }
        })
        return mutableLiveData
    }
}