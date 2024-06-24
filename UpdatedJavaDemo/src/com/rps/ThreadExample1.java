package com.rps;




public class ThreadExample1 implements Runnable{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method:"+Thread.currentThread().getName());
		ThreadExample1 t1=new ThreadExample1();
		Thread t=new Thread(t1);
		t.setName("Rajan");
		Thread t2=new Thread(t1);
		t2.setName("Alok");
		Thread t3=new Thread(t1);
		t3.setName("Om");
		t.start();
		t2.start();
		t3.start();
		System.out.println(t.isAlive());
		System.out.println(Thread.activeCount());
		  try {
			  t.join();
		  }

		  catch(InterruptedException e) {
			  e.printStackTrace();
		  }
		  System.out.println(t.isAlive());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child: "+Thread.currentThread().getName());}

}
