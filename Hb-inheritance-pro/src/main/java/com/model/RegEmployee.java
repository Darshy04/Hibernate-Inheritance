package com.model;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity 
@DiscriminatorValue(value="regular")

public class RegEmployee extends Employee{
	float salary;
	String dept;
	public RegEmployee() {
		
	}
	public RegEmployee(float salary, String dept) {
		super(name);
		this.salary = salary;
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
