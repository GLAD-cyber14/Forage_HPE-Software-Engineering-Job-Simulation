package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;


    public Employee(){}

    public Employee(int employeeId, String firstName, String lastName, String email, String title) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Employee [id=" + employeeId + ", firstName=" + firstName +
                ", lastName=" + lastName + ", email=" + email + ", title=" + title+"]";
    }
}

