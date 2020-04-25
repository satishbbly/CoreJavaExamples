package com.satish.java;

public class IntToRoman {

	public static void main(String[] args) {
		
		System.err.println(intToRoman(2345));
	}
	
	public static String intToRoman(int n)
	{
		 String[] thousands=new String[]{"","M","MM","MMM"};
		 String[] hundreds=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		 String[] tens=new String[]{"","X","XX","XXX","XL","L","LC","LCC","LCCC","XC"};
		 String[] units=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		 return thousands[n/1000]+
				hundreds[(n%1000)/100]+
				tens[(n%100)/10]+
				units[n%10];
	}

}
