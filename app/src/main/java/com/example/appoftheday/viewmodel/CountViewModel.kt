package com.example.appoftheday.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel(){

    //livedata (Yt channel)
    private val count = MutableLiveData<Int>()

    fun getCount(): LiveData<Int>{
        return count
    }

init{ //same as constructor
count.value=0 //since 0 diye initialize kore dicchi tai null howar chances e nei
}
    fun increament(){
        count.value= count.value!!+1
    }

    fun decreament(){
        count.value = count.value!!-1
    }

}