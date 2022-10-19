package com.example.conceptosPooKotlin

class Athlete (name:String, surname:String, age:Int, weight:Float, category:String): PersonActions, Person(name, surname, age, weight){

    private var category: String=category

    init {
        println(toString())
    }

    constructor():this("","",0,0f,"")

    fun setCategory(category:String){
        this.category = category
    }
    fun getCategory():String{
        return this.category
    }

    override fun move(meters: Int): String {
        return "El atleta se movio $meters metros."
    }

    override fun toString(): String {
        return "Athlete(category='$category') ${super.toString()}"
    }

}