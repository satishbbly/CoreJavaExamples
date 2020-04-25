package com.satish.java.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {
	
	@NonNull
	private int employeeId;
	private String name;
	private double salary;
}
