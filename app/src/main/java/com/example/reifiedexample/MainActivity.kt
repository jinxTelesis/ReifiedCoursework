package com.example.reifiedexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myIntList: List<Int> = mutableListOf(1,2,3,4)

        val date: Date = Date()
        val myDateList: List<Date> = mutableListOf(Date())

        val genericTrick: GenericTrick = GenericTrick()

        genericTrick.withClass(myIntList)
    }
}
