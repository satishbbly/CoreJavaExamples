package com.satish.java.lamda;

import java.util.function.Predicate;

public class StandardFunctionLamda {

	public static void main(String[] args) {
		Predicate<Integer> even=(i)->i % 2==0;

		System.out.println(even.test(11));
	}

}
