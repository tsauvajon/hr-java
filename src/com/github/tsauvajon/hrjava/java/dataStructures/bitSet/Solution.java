package com.github.tsauvajon.hrjava.java.dataStructures.bitSet;

import java.util.BitSet;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        BitSet[] bitSets = new BitSet[2];

        bitSets[0] = b1;
        bitSets[1] = b2;

        for (int i = 0; i < m; i++) {
            String operation = scan.next();
            int param1 = scan.nextInt();
            int param2 = scan.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[param1-1].and(bitSets[param2-1]);
                    break;
                case "OR":
                    bitSets[param1-1].or(bitSets[param2-1]);
                    break;
                case "XOR":
                    bitSets[param1-1].xor(bitSets[param2-1]);
                    break;
                case "FLIP":
                    bitSets[param1-1].flip(param2);
                    break;
                case "SET":
                    bitSets[param1-1].set(param2);
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
