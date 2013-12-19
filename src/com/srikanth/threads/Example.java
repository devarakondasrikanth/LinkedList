package com.srikanth.threads;

public class Example {

    public static void main(String[] args){
    	
      Counter counter = new Counter();
      Thread threadA;
	try {
		threadA = new CounterThread(counter);
		  threadA.start();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      Thread threadB;
	try {
		threadB = new CounterThread(counter);
		threadB.start(); 
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
      
      
    }
  }