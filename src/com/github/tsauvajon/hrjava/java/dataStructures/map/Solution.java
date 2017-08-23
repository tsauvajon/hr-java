package com.github.tsauvajon.hrjava.java.dataStructures.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Map<String, Integer> map = new HashMap<>();

        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();

            map.put(name, phone);
        }

        while (scan.hasNext()) {
            String s = scan.nextLine();

            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
