package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day12Inheritance;

class Student extends Person {
    private final int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);

        this.testScores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    Character calculate() {
        int sum = 0;

        for (int score : testScores) {
            sum += score;
        }

        int avg = sum / testScores.length;

        if (avg < 40) {
            return 'T';
        }

        if (avg < 55) {
            return 'D';
        }

        if (avg < 70) {
            return 'P';
        }

        if (avg < 80) {
            return 'A';
        }

        if (avg < 90) {
            return 'E';
        }

        return 'O';
    }
}