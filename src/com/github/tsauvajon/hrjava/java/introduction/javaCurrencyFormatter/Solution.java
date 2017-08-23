package com.github.tsauvajon.hrjava.java.introduction.javaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatterUS.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = formatterIndia.format(payment);

        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatterChina.format(payment);

        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatterFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
