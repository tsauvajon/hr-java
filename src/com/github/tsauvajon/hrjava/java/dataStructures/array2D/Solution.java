package com.github.tsauvajon.hrjava.java.dataStructures.array2D;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassNb = i * 4 + j;
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int middle = arr[i + 1][j + 1];
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                int sum = top + middle + bottom;

                if (hourglassNb == 0 || sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
