package com.github.tsauvajon.hrjava.thirtyDaysOfCode.day23BstLevelOrderTraversal;

import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
    private static PriorityQueue<int[]> pq = new PriorityQueue<>(9999, (int[] a, int[] b) -> {
        if (a[1] == b[1]) {
            return a[2]-b[2];
        }

        return a[1]-b[1];
    });

    static void levelOrder(Node root) {
        levelOrder(root, 0);

        while (pq.size() > 0) {
            System.out.printf("%d ", pq.remove()[0]);
        }
    }

    static void levelOrder(Node root, int level) {
        if (root == null) {
            return;
        }

        pq.add(new int[] {
                root.data,
                level+1,
                pq.size()
        });

        levelOrder(root.left, level + 1);
        levelOrder(root.right, level + 1);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
