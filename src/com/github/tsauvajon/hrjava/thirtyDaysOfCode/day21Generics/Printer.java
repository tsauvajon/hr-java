package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day21Generics;

class Printer<T> {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    void printArray(T[] A) {
        for (T a : A) {
            System.out.println(a);
        }
    }
}
