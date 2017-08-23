package com.github.tsauvajon.hrjava.java.dataStructures.stack;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(input.charAt(i));
                } else {
                    if (input.charAt(i) == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (input.charAt(i) == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (input.charAt(i) == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(input.charAt(i));
                    }
                }
            }

            System.out.println(stack.isEmpty());
        }
    }
}