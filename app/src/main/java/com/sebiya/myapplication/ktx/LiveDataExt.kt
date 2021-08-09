package com.sebiya.myapplication.ktx

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

inline fun <T> LiveData<T>.filter(crossinline  predicate: (T) -> Boolean): LiveData<T> {
    return MediatorLiveData<T>().apply {
        addSource(this@filter) {
            if (predicate(it)) {
                value = it
            }
        }
    }
}