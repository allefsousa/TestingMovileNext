package com.example.allef.next.movilenext_loginapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import junit.extensions.ActiveTestSuite
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityEspressoTest{

    @get:Rule
    val rule = ActivityTestRule(LoginActivity::class.java)


    @Test
    fun LoginButtonWriteName(){
        // digitar o login no editText
        // clicar no botão
        // checar se o textview foi alterado
        onView(withHint("Type your E-mail"))
                .perform(typeText("admin@admin.com"))
                .perform(click())

        onView(withText("Login")).perform(click())

        onView(withText("Allef sousa santos"))
                .check(matches(isDisplayed()))
    }



}