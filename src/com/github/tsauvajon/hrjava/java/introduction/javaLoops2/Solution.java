package com.github.tsauvajon.hrjava.java.introduction.javaLoops2;

import java.util.Scanner;

class Solution {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int k = 0; k < n; k++) {
                double result = series(a, b, k);
                System.out.printf("%.0f ", result);
            }

            System.out.println();
        }

        in.close();
    }

    private static double series(int a, int b, int k) {
        if (k == 0) {
            return a + b;
        }

        return (Math.pow(2, k) * b) + series(a, b, k - 1);
    }
}
