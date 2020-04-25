package com.satish.java;

import java.util.ArrayList;

public class VarTest {

	public static void main(String[] args) {

		var v=10;
		
		var str="Hello World";
		
		//var bean= new SimpleRemoteStatelessSessionFactoryBean();
		
		var var=10.5;
		
		var names=new ArrayList<String>();
		
		var first="Satish";
		
		var last="Kumar";	
		
		var fullname=first+last;
		
		var namesToStr=names.toString();
		
		String String="satish";
		
		System.err.println(String);
		
		System.out.println(var);
		
		System.out.println(fullname);
		
		System.out.println(v+str);
		//initialization should be on the same line
		
		//you cannot declare var type for instance variable
		
		//you cannot declare method parameter as var type
		
		//you cannot declare return type in method signature as var type
		
		// you cannot assign lamda expression to var type
		
		//var is not a reserved word
		
		
	}

}
