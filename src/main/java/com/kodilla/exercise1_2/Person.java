package com.kodilla.exercise1_2;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return dateOfBirth.until(LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", dateOfBirth: " + dateOfBirth;
    }

}