package com.org.assess;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMaleAndFemales {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		Map<Object, Long> genderCount = listOfEmployee.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		genderCount.forEach((e1, e2) -> System.out.println(e1 + ":" + e2));
	}

}
