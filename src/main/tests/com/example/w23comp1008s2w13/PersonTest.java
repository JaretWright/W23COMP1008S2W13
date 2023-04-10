package com.example.w23comp1008s2w13;

import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    @org.junit.Before
    public void setUp() throws Exception {
        person = new Person("Fred","Flintstone","123 Bedrock", LocalDate.of(1965,10,2));
    }

    @org.junit.Test
    public void setFirstName() {
        person.setFirstName("Frank");
        assertEquals("Frank", person.getFirstName());
    }

    @org.junit.Test
    public void setFirstNameLowerCase() {
        person.setFirstName("frank");
        assertEquals("Frank", person.getFirstName());
    }

    @org.junit.Test
    public void setFirstNameLowerCaseWithSpaces() {
        person.setFirstName("     frank     ");
        assertEquals("Frank", person.getFirstName());
    }

    @org.junit.Test
    public void setLastName() {
    }

    @org.junit.Test
    public void setAddress() {
    }

    @org.junit.Test
    public void setDobInvalidFuture() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            person.setDob(LocalDate.of(2030,12,12));});
    }

    @org.junit.Test
    public void getAge() {
    }
}