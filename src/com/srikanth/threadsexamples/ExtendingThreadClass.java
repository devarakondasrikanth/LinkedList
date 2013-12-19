package com.srikanth.threadsexamples;

public class ExtendingThreadClass extends Thread {

	ExtendingThreadClass(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("I am in the ExtendingThreadClass "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			doSomeDBActivity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+Thread.currentThread().getName() + "finished its processing");
	}
	private void doSomeDBActivity() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("I am in the ExtendingThreadClass "+Thread.currentThread().getName());
		Thread.sleep(2078);
		
	}
}
