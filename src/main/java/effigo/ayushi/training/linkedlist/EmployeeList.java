package effigo.ayushi.training.linkedlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import effigo.ayushi.training.arraylist.Employee;

public class EmployeeList {
	public static void main(String[] args) throws ParseException{
		List<Employee> employeeList = new LinkedList<>();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		employeeList.add(new Employee(1001, "Ayushi", formatter.parse("02-08-2000"), 25000.0));
		employeeList.add(new Employee(1002, "Dhruv", formatter.parse("29-05-2002"), 250000.0));
		employeeList.add(new Employee(1003, "Vidushi", formatter.parse("07-07-2002"), 21000.0));
		employeeList.add(new Employee(1004, "Abhi", formatter.parse("04-10-2004"), 50.0));
		employeeList.add(new Employee(1005, "Harshit", formatter.parse("24-08-2003"), 250.0));
		employeeList.add(new Employee(1006, "Riya", formatter.parse("22-07-2001"), 5000.0));
		
		for(Employee emp: employeeList) {
			System.out.println(emp.getId() + " " + " " + emp.getName() + " " + emp.getDob() + " " + emp.getSalary());
		}
		
		System.out.println("After removing: ");
		employeeList.remove(2);
		for(Employee emp: employeeList) {
			System.out.println(emp.getId() + " " + " " + emp.getName() + " " + emp.getDob() + " " + emp.getSalary());
		}
		
		System.out.println("After adding at certain index: ");
		employeeList.set(2, new Employee(1003, "Vidushi", formatter.parse("07-07-2002"), 21000.0));
		for(Employee emp: employeeList) {
			System.out.println(emp.getId() + " " + " " + emp.getName() + " " + emp.getDob() + " " + emp.getSalary());
		}
		
		Employee emp = employeeList.get(2);
		System.out.println("get method: " + emp.getName());
	}

}
