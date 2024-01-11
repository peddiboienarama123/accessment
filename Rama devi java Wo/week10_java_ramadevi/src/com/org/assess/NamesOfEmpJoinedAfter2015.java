package com.org.assess;

import java.util.List;
import java.util.stream.Collectors;

public class NamesOfEmpJoinedAfter2015 {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		List<Employee> listOfEmployee = employeeDetails.employeeList();
		List<String> namesOfEmp=listOfEmployee.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).collect(Collectors.toList());
		namesOfEmp.forEach(e->System.out.println(e));
	}

}
