package com.org.assess;

import java.util.List;

public class JunitTest {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		listOfEmployee.stream().filter(e->e.getName().equalsIgnoreCase("gopi")).forEach(e->System.out.println(e));
	}

}
