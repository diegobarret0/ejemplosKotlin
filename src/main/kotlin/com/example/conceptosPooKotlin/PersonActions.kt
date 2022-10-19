package com.example.conceptosPooKotlin

interface PersonActions {
    fun move(meters: Int): String

    fun greet(): String{
        return "Hola desde interface PersonActions"
    }
}