package com.maven.service;



import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.maven.dto.Employee;

class EmployeeServiceImplTest {
	EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
	Employee employee = new Employee(101, "TEST", 10000.0, "JAVA");
	

	@Test
	void testcreateEmployee() {
		Optional<Employee> adddeEmployee = employeeServiceImpl.addEmployee(employee);
		assertTrue(adddeEmployee.isPresent());
		assertNotNull(adddeEmployee.get());
	}
	@Test
	void testGetEmployeeEmployeeById() {
		employeeServiceImpl.addEmployee(employee);
		Optional<Employee> employee = employeeServiceImpl.getEmployeeById(101);
		assertTrue(employee.isPresent());
		assertNotNull(employee.get());

}
}
