package com.srikanth.overriding;

public class OverridingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		DerivedClass dc = new DerivedClass();
		BaseClass bc_dc = new DerivedClass();
		bc.sysPrint();
		dc.sysPrint();
		System.out.println("\n");
		bc_dc.sysPrint();
		bc_dc.baseClassPrintOnly();
	}

}
