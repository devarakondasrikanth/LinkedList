package com.srikanth.inheritance;

public class HondaUnicorn extends Automobile{

	HondaUnicorn()
	{
		System.out.println("In honda Unicorn class");
	}
	private int noMirrors;
	private double tankCapacity;
	private int headLights;
	public int getNoMirrors() {
		return noMirrors;
	}
	public void setNoMirrors(int noMirrors) {
		this.noMirrors = noMirrors;
	}
	public double getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public int getHeadLights() {
		return headLights;
	}
	public void setHeadLights(int headLights) {
		this.headLights = headLights;
	}
}
