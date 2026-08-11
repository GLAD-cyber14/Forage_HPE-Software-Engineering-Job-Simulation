package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager{
    private Employees employees;

    public EmployeeManager(){
        employees = new Employees();
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"John","Smith","johnsmith@gmail.com","Developer"));
        employeeList.add(new Employee(2,"Michael","Brown","michaelbrown@gmail.com","Tester"));
        employeeList.add(new Employee(3,"Samuel","Benny","samuelbenny@gmail.com","Manager"));
        employeeList.add(new Employee(4,"George","Lake","georgelake@gmail.com","Designer"));

        employees.setEmployees(employeeList);
    }
    public Employees getEmployees() {
        return employees;
    }
}
