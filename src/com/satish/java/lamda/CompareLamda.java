package com.satish.java.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.satish.java.lamda.modal.Person;

public class CompareLamda {

	public static void main(String[] args) {
		Person p= new Person(1, 35, "Satish");
		Person p1= new Person(2, 32, "Vinutha");
		Person p2= new Person(3, 2, "Saketh");
		Person p3= new Person(4, 55, "Anatha Lakshmi");
		Person p4= new Person(5, 60, "Manikya");
		List<Person> l=new ArrayList<>();
		l.add(p);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		Comparator<Person> c= (Person p5,Person p6) -> p5.getName().compareTo(p6.getName());
		l.sort(c);
		
		l.forEach(a->System.out.println(a.getName()));
		
		c= (Person p5,Person p6) -> p5.getAge()-p6.getAge();
		l.sort(c);
		
		l.forEach(a->System.out.println(a.getAge()));		

	}

}
