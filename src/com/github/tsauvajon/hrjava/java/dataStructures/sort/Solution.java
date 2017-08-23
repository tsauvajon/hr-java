package com.github.tsauvajon.hrjava.java.dataStructures.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort((a, b) -> {
            if (a.getCgpa() != b.getCgpa()) {
                return b.getCgpa() - a.getCgpa() > 0 ? 1 : -1;
            }

            if (!a.getFname().equals(b.getFname())) {
                return a.getFname().compareTo(b.getFname());
            }

            return a.getId() - b.getId();
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
