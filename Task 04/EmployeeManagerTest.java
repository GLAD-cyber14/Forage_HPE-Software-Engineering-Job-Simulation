package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

	@Test
	void testGetEmployees() {

		EmployeeManager employeeManager = new EmployeeManager();

		Employees employees = employeeManager.getEmployees();

		assertNotNull(employees);
		assertNotNull(employees.getEmployees());
		assertEquals(4, employees.getEmployees().size());
	}

	@Test
	void testAddEmployee() {

		EmployeeManager employeeManager = new EmployeeManager();

		Employee employee = new Employee(
				5,
				"John",
				"Doe",
				"john@example.com",
				"Developer"
		);

		employeeManager.addEmployee(employee);

		Employees employees = employeeManager.getEmployees();

		assertEquals(5, employees.getEmployees().size());
		assertEquals("John", employees.getEmployees().get(4).getFirstName());
		assertEquals("Doe", employees.getEmployees().get(4).getLastName());
	}
}