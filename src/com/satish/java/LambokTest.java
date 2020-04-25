package com.satish.java;

import com.satish.java.model.Employee;
import com.satish.java.model.User;

import lombok.Data;


public class LambokTest {
	
	
	public static void main(String args[])
	{
		User u1=new User("satish","Bangalore", "9999","satish@gmail.com");
		User u2=new User("satish","Bangalore", "9999","satish@gmail.com");

		System.err.println(u1.getEmail());
		System.err.println(u1);
		System.err.println(u1.hashCode());
		System.err.println(u1.equals(u2));
		
		Employee e=new Employee(1234);
		e.setName("satish");
		e.setSalary(120000);
		Employee e1=new Employee(1234);
		e1.setName("satish");
		e1.setSalary(120000);
		System.err.println(e);
		System.err.println(e.hashCode());
		System.err.println(e.equals(e1));
	}
	
}
