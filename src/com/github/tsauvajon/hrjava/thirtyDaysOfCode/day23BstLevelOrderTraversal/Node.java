package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day23BstLevelOrderTraversal;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}