package com.example.conceptosPooKotlin

fun main() {
    val student = Student()
    val athlete = Athlete("Lasha", "Talakhadze", 29, 183f, "+109")

    student.setName("Arturo")
    student.weight = 81f

    println("--------------------------------------------------------")

    println("Nombre de estudiante: ${student.getName()}")
    println("Estudiante pesa: ${student.weight}")
    println(student.move(5))
    println(student.study())
    println(student.study("matematicas"))
    println(student.greet())

    println("--------------------------------------------------------")

    println("Nombre de atleta: ${athlete.getName()}")
    println("Atleta pesa: ${athlete.weight}")
    println(athlete.move(20))
    println(athlete.greet())

    println("--------------------------------------------------------")

    val personList = ArrayList<Person>()

    personList.add(student)
    personList.add(athlete)

    println("Lista de persona: $personList")

}