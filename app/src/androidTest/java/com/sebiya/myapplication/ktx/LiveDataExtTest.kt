package com.sebiya.myapplication.ktx

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.Test

class LiveDataExtTest {
    @Test
    fun test() = runBlocking(Dispatchers.Main) {
        MutableLiveData("test").filter { it == "test" }.observeForever {

        }
    }
}