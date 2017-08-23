package com.github.tsauvajon.hrjava.java.dataStructures.array1D;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int anA : a) {
            System.out.println(anA);
        }
    }
}