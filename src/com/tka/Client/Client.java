package com.tka.Client;

import com.tka.Employee.Employee;
import com.tka.makeEmployee.createEmployee;

public class Client {

	public static void main(String[] args) {

	Employee ee=createEmployee.makeEmployee1();
	
	ee.printEmployeeDetail();
	}

}
