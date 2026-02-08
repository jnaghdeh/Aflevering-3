package com.example.lib

fun main () {

        val emp1 = Employee("Peter", "Hansen", 20000f)
        val emp2 = Employee("Maria", "Nielsen", 25000f)

        println(emp1.getYearlySalary())
        println(emp2.getYearlySalary())

        emp1.giveRaise10Percent()
        emp2.giveRaise10Percent()

        println(emp1.getYearlySalary())
        println(emp2.getYearlySalary())

}