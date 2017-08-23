package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day12Inheritance;

class Person {
    private final String firstName;
    private final String lastName;
    private final int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}