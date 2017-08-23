package com.github.tsauvajon.hrjava.java.dataStructures.priorityQueue;

class Student {
    private final String name;
    private final int id;
    private final double cgpa;

    int getId() {
        return id;
    }

    double getCgpa() {
        return cgpa;
    }

    String getName() {
        return name;
    }

    Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}
