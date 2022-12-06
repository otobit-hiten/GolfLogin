package com.example.golflogin

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {


        var phoneNumber : String? = null
        var pin : String? = null
        private val repository = Repository()

        fun callLogin():MutableLiveData<Resource<LoginResponse>>{
                return repository.logindetail()
        }

        fun onLogin(view :View){

        }

}