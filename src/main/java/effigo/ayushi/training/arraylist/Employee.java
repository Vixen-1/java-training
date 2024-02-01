package effigo.ayushi.training.arraylist;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private Date dob;
	private double salary;
	
	public Employee(int id, String name, Date dob, double salary) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
