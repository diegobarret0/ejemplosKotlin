package com.example.conceptosPooKotlin

abstract class Person (name:String, surname:String, age:Int, weight:Float){
    private var name = name
    private var surname = surname
    private var age = age

    var weight = weight
        get() = field + .1f
        set(value) {
            field = value + .1f
        }

    fun setName(name:String){
        this.name = name
    }

    fun getName():String {
        return this.name
    }


    override fun toString(): String {
        return "Person(name='$name', surname='$surname', age=$age, weight=$weight)"
    }
}