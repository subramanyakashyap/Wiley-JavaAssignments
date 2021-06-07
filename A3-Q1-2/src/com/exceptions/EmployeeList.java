package com.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EmployeeList {
	
	private ArrayList<String> nameList = new ArrayList<String>();
	private ArrayList<Employee> empList = new ArrayList<Employee>();
	public void addEmployees(String name,  Integer age) throws DuplicateException {
		if(nameList.contains(name))
			throw new DuplicateException(name+ " Already Exists!");
		else if(age<18 || age>60)
			throw new AgeException(" Unacceptable Age!");
		else
			empList.add(new Employee(name, age));
			nameList.add(name);
	}
	
	
	public void display() {
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	

}
