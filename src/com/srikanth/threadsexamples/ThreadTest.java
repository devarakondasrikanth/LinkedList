package com.srikanth.threadsexamples;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new ImplementingInterface(),"t1");
		Thread t2 = new Thread(new ImplementingInterface(),"t2");
		System.out.println("Starting the thread using runnable interface");
		t1.start();
		t2.start();
		System.out.println("Sucessfully started the threads ...!");
		ExtendingThreadClass t3 = new ExtendingThreadClass("t3");
		ExtendingThreadClass t4 = new ExtendingThreadClass("t4");
		System.out.println("Starting the thread by extending the thread class");
		t3.start();
		t4.start();
		System.out.println("Sucessfully started the threads ...!");
		
	}

}
