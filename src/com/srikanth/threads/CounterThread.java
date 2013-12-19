package com.srikanth.threads;

public class CounterThread extends Thread{

    protected Counter counter = null;

    public CounterThread(Counter counter) throws InterruptedException{
       this.counter = counter;
     
    }

    public void run() {
	for(int i=0; i<10; i++){
          counter.add(i);
          try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
    }
 }