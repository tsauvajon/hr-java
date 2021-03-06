package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day24MoreLinkedLists;

import java.util.Scanner;

class Solution {
    // iterative solution
    public static Node removeDuplicates(Node head) {
        Node root = head;

        while (head != null) {
            while (head.next != null && head.next.data == head.data) {
                head.next = head.next.next;
            }

            head = head.next;
        }

        return root;
    }

    // recursive solution
    public static Node removeDuplicatesRecursively(Node head) {
        if (head == null) {
            return head;
        }

        while (head.next != null && head.next.data == head.data) {
            head.next = head.next.next;
        }

        head.next = removeDuplicatesRecursively(head.next);

        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
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
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicatesRecursively(head);
        display(head);

    }
}