package effigo.ayushi.training.arraylist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) throws ParseException {
		
	List<Employee> employeeList = new ArrayList<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	
	employeeList.add(new Employee(1001, "Ayushi", formatter.parse("02-08-2000"), 25000.0));
	employeeList.add(new Employee(1002, "Dhruv", formatter.parse("29-05-2002"), 250000.0));
	employeeList.add(new Employee(1003, "Vidushi", formatter.parse("07-07-2002"), 21000.0));
	employeeList.add(new Employee(1004, "Abhi", formatter.parse("04-10-2004"), 50.0));
	employeeList.add(new Employee(1005, "Harshit", formatter.parse("24-08-2003"), 250.0));
	employeeList.add(new Employee(1006, "Riya", formatter.parse("22-07-2001"), 5000.0));
	
	System.out.println();
	//set comparator for names
	Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
	
	//compare date of birth
	Collections.sort(employeeList, nameComparator);
	
	//Print the result
	System.out.println("Sorting on the basis of name is: ");
	for(Employee emp : employeeList) {
		System.out.println(emp.getId() + ": " + emp.getName() );
	}
	
	System.out.println();
	//set comparator for salary
	Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
	
	//compare salaries
	Collections.sort(employeeList, salaryComparator);
	
	//Print the result
	System.out.println("Sorting on the basis of salary is: ");
	for(Employee emp : employeeList) {
		System.out.println(emp.getName() + ": " + emp.getSalary() );
	}
	
	System.out.println();
	//set comparator for names
	Comparator<Employee> dobComparator = Comparator.comparing(Employee::getDob);
	
	//compare date of birth
	Collections.sort(employeeList, dobComparator);
	
	//Print the result
	System.out.println("Sorting on the basis of date of birth is: ");
	for(Employee emp : employeeList) {
		System.out.println(emp.getName() + ": " + emp.getDob() );
	}
	
	}
}
