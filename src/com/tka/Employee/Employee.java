package com.tka.Employee;

import com.tka.Address.Address;
import com.tka.Department.Department;

public class Employee {
	
	private String name;
	private int age;
	private String conNo;
	private double salary;
	private String cName;
	
	private Address add;
	private Department dep;
	
	
	public Employee(String name, int age, String conNo, double salary, String cName, Address add, Department dep) {
		super();
		this.name = name;
		this.age = age;
		this.conNo = conNo;
		this.salary = salary;
		this.cName = cName;
		this.add = add;
		this.dep = dep;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getConNo() {
		return conNo;
	}


	public void setConNo(String conNo) {
		this.conNo = conNo;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public Department getDep() {
		return dep;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	public  void printEmployeeDetail()
	{
		System.out.println("---------Employee INFO-------");
		System.out.println("Employee name :"+name);
		System.out.println("Employee age :"+age);
		System.out.println("Employee contact number :"+conNo);
		System.out.println("Employee salary :"+salary);
		System.out.println("Employee company name :"+cName);
		System.out.println();
		
		System.out.println("------Employee  Address------");
		System.out.println("Employee city :"+add.getCity());
		System.out.println("Employee state :"+add.getState());
		System.out.println("Employee pincode :"+add.getPincode());
		System.out.println();
		
		System.out.println("------Department INFO-------");
		System.out.println("department name :"+dep.getdName());


	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", conNo=" + conNo + ", salary=" + salary + ", cName="
				+ cName + ", add=" + add + ", dep=" + dep + "]";
	}
}
