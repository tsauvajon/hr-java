package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day15LinkedList;

import java.util.Scanner;

class Solution {
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node tail = head;

        // Can be done with recursion
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = newNode;

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        display(head);
        sc.close();
    }
}