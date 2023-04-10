package com.example.w23comp1008s2w13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class Student extends Person {

    private ArrayList<Grade> grades;
    private int studentNum;

    public Student(String firstName, String lastName, String address, LocalDate dob, int studentNum) {
        super(firstName, lastName, address, dob);
        setStudentNum(studentNum);
        grades= new ArrayList<>();
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void addGrade(Grade newGrade)
    {
        grades.add(newGrade);
    }

    public double getAvgGrade()
    {
        if (grades.size()==0)
            return -1;
        else
        {
            double total = 0.0;
            for (Grade grade : grades)
                total += grade.getGrade();

            return total/grades.size();
        }
    }

    public String toString()
    {
        return String.format("%d-%s",studentNum,super.toString());
    }
}
