package com.example.kotlinmvvmexample.model

data class Subject(var name:String,var grade:String) {

    override fun toString(): String {
        return "$name - $grade"
    }
}