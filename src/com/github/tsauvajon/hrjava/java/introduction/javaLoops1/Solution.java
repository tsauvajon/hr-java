package com.github.tsauvajon.hrjava.java.introduction.javaLoops1;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}