package com.srikanth.overriding;

public class DerivedClass extends BaseClass {

	DerivedClass()
	{
		System.out.println("In derived Class constructor");
	
	}
	public void sysPrint()
	{
		System.out.println("In derived class sysPrint() method");
	}
	public void myPrint()
	{
		System.out.println("In derived class myPrint() method");
	}
}
