package com.github.tsauvajon.hrjava.java.dataStructures.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> global = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();

            ArrayList<Integer> sub = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                sub.add(scan.nextInt());
            }

            global.add(sub);
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            try {
                System.out.println(global.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}