package com.github.tsauvajon.hrjava.java.bigNumber.primalityTest;

import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger n = scan.nextBigInteger();
        scan.close();

        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
