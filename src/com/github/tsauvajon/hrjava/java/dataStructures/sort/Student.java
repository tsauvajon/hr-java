package com.github.tsauvajon.hrjava.java.dataStructures.sort;

class Student{
    private final int id;
    private final String fname;
    private final double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}