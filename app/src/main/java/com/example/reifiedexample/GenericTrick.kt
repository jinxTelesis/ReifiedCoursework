package com.example.reifiedexample

import android.util.Log
import java.util.*

class GenericTrick {

    inline fun <reified T: Any> withClass(list: List<T>){

        when (T::class){
            Int::class -> {System.out.println("was the int class")}
            Date::class -> {System.out.println("was the data class")}
            else -> {}
        }
    }
}