package com.tka.makeEmployee;

import com.tka.Address.Address;
import com.tka.Department.Department;
import com.tka.Employee.Employee;

public class createEmployee {
	
	public static Employee makeEmployee1()
	{
		Employee emp = new Employee("aaa", 40, "9325508449", 10000, "TCS",
				new Address("pune", "MAHA", "413150"),
				new Department("Software Developer"));
		
		return emp;
		
	}

}
