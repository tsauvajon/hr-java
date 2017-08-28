package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day17MoreExceptions;

class Calculator {
    int power(int n, int p) throws Exception {
        double doubleN = (double) n;
        double doubleP = (double) p;
        return power(doubleN, doubleP);
    }

    int power(double n, double p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        return (int)Math.pow(n,  p);
    }
}
