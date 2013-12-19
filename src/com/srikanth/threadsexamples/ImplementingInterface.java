package com.srikanth.threadsexamples;

public class ImplementingInterface implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Currently creating a thread with thread name "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			doDBActivity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+Thread.currentThread().getName() + "finished its processing");
	}

	private void doDBActivity() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("Doing DB Connectivity and executing the SQL statements "+Thread.currentThread().getName());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
