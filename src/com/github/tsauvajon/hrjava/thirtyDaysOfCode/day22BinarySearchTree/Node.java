package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day22BinarySearchTree;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}