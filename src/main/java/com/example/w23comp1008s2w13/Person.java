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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        this.dob = dob;
    }
}
