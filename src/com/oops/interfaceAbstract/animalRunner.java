package com.oops.interfaceAbstract;

public class animalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Cat(), new Dog()};
		for (Animal animal:animals) {
			animal.bark();
		}
	}

}
