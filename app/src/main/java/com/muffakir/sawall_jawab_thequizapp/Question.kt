package com.muffakir.sawall_jawab_thequizapp

data class Question (
    val id : Int,
    val questions : String,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctAnswer : Int
        )