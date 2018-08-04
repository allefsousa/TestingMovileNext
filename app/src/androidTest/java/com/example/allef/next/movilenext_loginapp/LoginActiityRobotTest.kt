package com.example.allef.next.movilenext_loginapp

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.example.allef.next.movilenext_loginapp.robot.LoginRobot
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class LoginActiityRobotTest {

    @get:Rule
val rule = ActivityTestRule(LoginActivity::class.java)
    lateinit var robot:LoginRobot

    @Before
    fun setUp() {
    robot = LoginRobot(rule.activity)
    }

//    fun loginSucess(){
//        robot
//                .setEmail("admin@admin")
//                .setPassword("admin")
//                .clickLogin()
//                .matchText(R.id.tvStatus,"Allef sousa")
//
//    }
}