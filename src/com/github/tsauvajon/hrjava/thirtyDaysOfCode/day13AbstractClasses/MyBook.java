package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day13AbstractClasses;

class MyBook extends Book {
    private final int price;

    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
