package com.org.assess;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesOfAllEmployeesInEachDepartment {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		Map<Object, List<Employee>> emp = listOfEmployee.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.toList()));
		emp.entrySet().forEach(name -> System.out.println((name)));
	}
}
