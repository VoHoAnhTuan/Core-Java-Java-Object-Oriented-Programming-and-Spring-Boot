package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Tuan"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		List<Student> studentAl = new ArrayList<>(students);
		
		System.out.println(students);
		Collections.sort(studentAl);
		System.out.println(studentAl);
	}

}
