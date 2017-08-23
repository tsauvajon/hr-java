package com.github.tsauvajon.hrjava.java.dataStructures.generics;

class Printer {
    <T> void printArray(T[] array) {
        for (T anArray : array) {
            System.out.println(anArray);
        }
    }
}