package com.github.tsauvajon.hrjava.java.dataStructures.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            String query = scan.next().trim();

            switch (query) {
                case "Insert": {
                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    l.add(x, y);
                    break;
                }
                case "Delete": {
                    int x = scan.nextInt();
                    l.remove(x);
                    break;
                }
                default:
                    System.out.println(query);
                    break;
            }
        }

        l.forEach(i -> System.out.printf("%d ", i));
    }
}