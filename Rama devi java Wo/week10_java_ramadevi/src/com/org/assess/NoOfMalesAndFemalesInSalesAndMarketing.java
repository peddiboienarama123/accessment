package com.org.assess;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfMalesAndFemalesInSalesAndMarketing {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		Map<Object, Long> CountOfGender=listOfEmployee.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")||e.getDepartment().equalsIgnoreCase("marketing"))
		         .collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		CountOfGender.forEach((e1, e2) -> System.out.println(e1 + ":" + e2));
	}

}
