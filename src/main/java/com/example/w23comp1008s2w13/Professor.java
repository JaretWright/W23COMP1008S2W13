package com.example.w23comp1008s2w13;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Person{
    private ArrayList<String> teachables;

    public Professor(String firstName, String lastName, String address, LocalDate dob, ArrayList<String> teachables) {
        super(firstName, lastName, address, dob);
        setTeachables(teachables);
    }

    public ArrayList<String> getTeachables() {
        return teachables;
    }

    public void addTeachable(String courseCode)
    {
        courseCode = courseCode.replaceAll(" ","");
        courseCode = courseCode.toUpperCase();
        if (courseCode.matches("[A-Z]{4}[0-9]{4}"))
            teachables.add(courseCode);
        else
            throw new IllegalArgumentException(courseCode + " invalid. Course code must be 4 characters followed by 4 num");
    }


    public void setTeachables(ArrayList<String> teachables) {
        if (this.teachables == null)
            this.teachables = new ArrayList<>();

        for (String courseCode : teachables)
            addTeachable(courseCode);
    }

    public String toString()
    {
        return String.format("%s is qualified to teach %d courses",
                                    super.toString(),teachables.size());
    }
}
