package com.srikanth.inheritance;

public class Automobile {

	Automobile()
	{
		System.out.println("In automobile class");
	}
	private String name;
	private long engineCapacity;
	private String fuelType;
	private int noTyres;
	public void printAutomobile()
	{
		System.out.println("Building Honda Unicorn using Automobile class");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(long engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getNoTyres() {
		return noTyres;
	}
	public void setNoTyres(int noTyres) {
		this.noTyres = noTyres;
	}
	
	
}
