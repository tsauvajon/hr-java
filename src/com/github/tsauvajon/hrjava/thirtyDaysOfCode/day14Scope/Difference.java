package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day14Scope;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        if (elements.length == 0) {
            return;
        }

        int min = elements[0];
        int max = elements[0];

        for(int element : elements) {
            if (element > max) {
                max = element;
            } else if (element < min) {
                min = element;
            }
        }

        maximumDifference = max - min;
    }
}
