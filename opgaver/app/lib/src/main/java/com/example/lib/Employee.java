package com.example.lib;

public class Employee{

    String firstName;
    String lastName;
    Float monthlySalary;


    public Employee(String firstName, String lastName, Float monthlySalary){
this.firstName = firstName;
        this.lastName = lastName;

                if (monthlySalary<0) {
                    this.monthlySalary = 0f;
                }
                else {
                    this.monthlySalary = monthlySalary;
                }
    }

public Float getYearlySalary() {
        return monthlySalary * 12;
}

public void giveRaise10Percent() {
        monthlySalary = monthlySalary * 1.10f;
}

}
