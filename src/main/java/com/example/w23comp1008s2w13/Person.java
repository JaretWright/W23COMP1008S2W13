package com.example.w23comp1008s2w13;

import java.time.LocalDate;

public class Person {
    private String firstName, lastName, address;
    private LocalDate dob;

    public Person(String firstName, String lastName, String address, LocalDate dob) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setDob(dob);
    }

    public String getFirstName() {
        return firstName;
    }

    private String refineName(String name)
    {
        name = name.trim();
        if (name.length()>0)
            return name.substring(0,1).toUpperCase()+name.substring(1);
        else
            throw new IllegalArgumentException("name cannot be empty");
    }

    public void setFirstName(String firstName) {
        firstName = refineName(firstName);
        if (firstName.matches("[A-Z][a-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must contain 2 or more characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = refineName(lastName);
        if (lastName.matches("[A-Z][a-z]*"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must contain 2 or more characters");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        if (dob.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Date of Birth cannot be in the future");
        this.dob = dob;
    }
}
