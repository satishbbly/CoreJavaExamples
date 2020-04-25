package com.satish.java.lamda;

public class Lamda {

	public static void main(String[] args) {
		Producer p=() ->System.out.println(10);
		p.produce();
		
		DoubleNumberFunction doubleNumberFunction = a -> a*2;
		System.out.println(doubleNumberFunction.doubleNumber(10));
		
		AddFunction add=(a,b)->a+b;
		System.out.println(add.add(10, 30));
		
		AddFunction subtract=(a,b)->a-b;
		System.out.println(subtract.add(30, 10));	
		
		AddFunction multiply=(a,b)->a*b;
		System.out.println(multiply.add(30, 10));	
		
		AddFunction devide=(a,b)->a/b;
		System.out.println(devide.add(30, 10));		
	}

}
