package com.srikanth.abstracts;

public class ABTest extends MyClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABTest abt = new ABTest();
		System.out.println("In the main Class");
		abt.printDesiredValues();
		System.out.println(abt.add(20, 30));
	}

	public void printDesiredValues() {
		// TODO Auto-generated method stub
		System.out.println("Implementing the abstract methods");
		ABTest abt = new ABTest();
		System.out.println("In the abstract class "+abt.add(20, 30));
	}

}
