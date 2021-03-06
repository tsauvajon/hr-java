package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day13AbstractClasses;

abstract class Book {
    final String title;
    final String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}