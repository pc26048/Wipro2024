package com.rps;

public class SharedObjectExample implements Runnable{

	private static volatile StringBuilder message=new StringBuilder("Welcome to Java");
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int size=message.length();
		synchronized(this) {
			for(int i=0;i<size;i++) {
				System.out.println(Thread.currentThread().getName()+": "+message.append('x'));
			}
		}
		
	}
	
	

}
