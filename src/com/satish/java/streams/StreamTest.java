package com.satish.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.satish.java.lamda.modal.Person;

public class StreamTest {

	public static void main(String[] args) {
		
		Person [] persons= {new Person(1, 35, "Satish"),
							new Person(2, 32, "Vinutha"),
							new Person(3, 2, "Saketh"),
							new Person(4, 55, "Anatha Lakshmi"),
							new Person(5, 60, "Manikya"),
							new Person(1, 35, "Satish"),
							new Person(2, 32, "Vinutha")};
	
		List<Person> l=Arrays.asList(persons);

		Comparator<Person> c= (Person p5,Person p6) -> p5.getName().compareTo(p6.getName());
		//l.sort(c);
		
		l.stream()
		 .filter(p8->p8.getName().startsWith("S"))
		 .sorted(c)
		 .forEach(p9->System.out.println(p9.getName()));
		
	long count=l.stream()
		 .filter(p10->p10.getName().startsWith("S") ||p10.getName().startsWith("V") )
		 .count();
	
	System.out.println("Count: "+count);
	
	l.stream()
	 .distinct()
	 .map(p -> new HashMap<Integer,String>().put(p.getAge(),p.getName()))
	 .forEach(map->System.out.println(map));
	
	List<String> myList = Stream.of("a", "b")
			  .map(String::toUpperCase)
			  .collect(Collectors.toList());
	
	System.err.println(myList);
	
	List<List<String>> list = Arrays.asList(
			  Arrays.asList("a"),
			  Arrays.asList("b"));
			System.out.println(list);
			
	System.out.println(list
					  .stream()
					  .flatMap(Collection::stream)
					  .collect(Collectors.toList()));

	}

}
