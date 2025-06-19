package com.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet - sorted order
		// LinkedHashSet - natural order
		// HashSet - neither order but the most efficient
		List<String> list = List.of("a", "z", "a", "b", "t");
		Set<String> treeSet = new TreeSet(list);
		System.out.println(treeSet);
	}

}
