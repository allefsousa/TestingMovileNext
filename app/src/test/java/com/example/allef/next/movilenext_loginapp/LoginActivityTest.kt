package com.example.allef.next.movilenext_loginapp

import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class LoginActivityTest{
    @Test
    fun loadActivity_ShoudHelloword(){
        val activity = Robolectric.setupActivity(LoginActivity::class.java)
        val results = activity.findViewById<TextView>(R.id.textview)
        assertThat(results.text.toString(),equalTo("Hello World!"))


    }
    @Test
    fun loadActivity_ShoudHelloword2(){
        val activity = Robolectric.setupActivity(LoginActivity::class.java)
        val results = activity.findViewById<TextView>(R.id.textview)
        assertThat(results.text.toString(),equalTo("Hello World!"))


    }
}