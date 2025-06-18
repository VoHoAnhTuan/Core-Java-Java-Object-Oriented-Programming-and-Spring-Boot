package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getId(), o1.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Tuan"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		List<Student> studentAl = new ArrayList<>(students);
		
		System.out.println(students);
		System.out.println();

		Collections.sort(studentAl);
		System.out.println(studentAl);
		
		System.out.println();
		Collections.sort(studentAl, new DescendingStudentComparator());
		System.out.println(studentAl);
	}

}
