package com.srikanth.interfaces;

public class InterfaceTest implements Engine{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest it = new InterfaceTest();
		it.fuelType("Petrol");
		it.capacityCC(1000);
	}

	public long capacityCC(long cc) {
		// TODO Auto-generated method stub
		System.out.println("Engine Capacity is " + cc);
		return cc;
	}

	public String fuelType(String fuel) {
		// TODO Auto-generated method stub
		System.out.println("Fule type for engine is "+fuel);
		return fuel;
	}

	
}
