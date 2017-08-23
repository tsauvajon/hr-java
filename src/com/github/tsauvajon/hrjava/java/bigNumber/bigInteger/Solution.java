package com.github.tsauvajon.hrjava.java.bigNumber.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());

        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);

        System.out.println(sum);
        System.out.println(multiply);
    }
}