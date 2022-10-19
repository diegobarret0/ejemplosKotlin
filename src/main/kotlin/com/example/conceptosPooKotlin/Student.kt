package com.example.conceptosPooKotlin

class Student (name:String, surname:String, age:Int, weight:Float): PersonActions, Person(name, surname, age, weight) {

    constructor(name: String, surname: String):this(name, surname, 0,0f)
    constructor():this("","",0,0f)

    fun study():String{
        return "Estudiando..."
    }
    fun study(subject:String):String{
        return "Estudiando $subject..."
    }

    override fun move(meters: Int): String {
        return "El estudiante se movio $meters metros."
    }

    override fun toString(): String {
        return "Student() ${super.toString()}"
    }

}