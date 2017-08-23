package com.github.tsauvajon.hrjava.java.dataStructures.priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Priorities extends PriorityQueue<Student> {
    Priorities() {
        super(100, Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId));
    }

    List<Student> getStudents(List<String> events) {
        int n = events.size();

        for (int i = 0; i < n; i++) {
            String[] event = events.get(i).split(" ");

            String type = event[0];

            switch (type) {
                case "ENTER":
                    String name = event[1];
                    Double cgpa = Double.parseDouble(event[2]);
                    int id = Integer.parseInt(event[3]);

                    add(new Student(id, name, cgpa));
                    break;
                case "SERVED":
                    poll();
                    break;
            }
        }

        ArrayList<Student> students = new ArrayList<>(this);

        students.sort(comparator());

        return students;
    }
}