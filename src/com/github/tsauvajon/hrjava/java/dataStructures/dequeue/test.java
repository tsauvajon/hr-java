package com.github.tsauvajon.hrjava.java.dataStructures.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            set.add(num);

            if (set.size() == m) {
                System.out.println(m);
                return;
            }

            if (set.size() > max) {
                max = set.size();
            }

            if (deque.size() == m) {
                int removed = deque.removeFirst();

                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }

        System.out.println(max);
    }
}