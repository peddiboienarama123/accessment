package com.org.assess;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmpDetails {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		Optional<Employee> emp = listOfEmployee.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println(emp);
	}

}
