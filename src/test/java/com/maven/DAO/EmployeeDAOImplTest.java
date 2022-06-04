package com.maven.DAO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.maven.dto.Employee;

class EmployeeDAOImplTest {
	EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
	Employee employee = new Employee(101, "TEST", 10000.0, "JAVA");
	

	@Test
	void testcreateEmployee() {
		Optional<Employee> adddeEmployee = employeeDAOImpl.addEmployee(employee);
		assertTrue(adddeEmployee.isPresent());
		assertNotNull(adddeEmployee.get());
	}
	@Test
	void testGetEmployeeEmployeeById() {
		employeeDAOImpl.addEmployee(employee);
		Optional<Employee> employee = employeeDAOImpl.getEmployeeById(101);
		assertTrue(employee.isPresent());
		assertNotNull(employee.get());

}
}
