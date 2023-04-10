package com.example.w23comp1008s2w13;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestingExperiment {
    public static void main(String[] args) {
        Student student = new Student("George","Washington","123 Delaware St",
                                        LocalDate.of(1732,02,22),200000);

        Professor professor = new Professor("Prof","Gizmo","5 HappyVale St",
                LocalDate.of(1976,10,12),new ArrayList<String>());
        professor.addTeachable("COMP 1008");
        professor.addTeachable("comp   1011    ");
        professor.addTeachable("COMP3025");

        Person person = new Person("Jake","Griswald",
                "22 Blueberry Lane", LocalDate.of(1980,10,1));

        System.out.println(person);
        System.out.println(student);
        System.out.println(professor);
    }
}
