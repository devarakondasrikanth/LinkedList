package com.srikanth.threads;

public class ExtendThread extends Thread{

	/**
	 * @param args
	 */
	public void Print()
	{
		for(int i=10;i<300000;i++)
			System.out.println(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread("Siri Thread");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		//t2.start();
		Thread1 tt1 = new Thread1();
		Thread2 tt2 = new Thread2();
		Thread tx1 = new Thread(tt1);
		Thread tx2 = new Thread(tt2);
		tx1.start();
		tx2.start();
		
	}

}
