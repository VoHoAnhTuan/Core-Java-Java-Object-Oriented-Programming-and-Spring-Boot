package com.oops.interfaceAbstract;

public class FlyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
		flyingObjects[0].fly();
		flyingObjects[1].fly();
	}

}
