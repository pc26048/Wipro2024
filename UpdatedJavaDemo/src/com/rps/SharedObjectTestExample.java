package com.rps;

public class SharedObjectTestExample {
	
	public static void main(String [] args) {
		SharedObjectExample sharedObject=new SharedObjectExample();
		Thread t1=new Thread(sharedObject);
		
		t1.start();
		Thread t2=new Thread(sharedObject);
		t2.start();
		Thread t3=new Thread(sharedObject);
		t3.start();
	}

}
