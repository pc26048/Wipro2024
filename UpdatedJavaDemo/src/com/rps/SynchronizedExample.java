package com.rps;



class Display{
	public void example(String name) {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				System.out.println("good morning ");
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Display d;
		String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.example(name);
	}
}

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d=new Display();
		MyThread t1=new MyThread(d,"Aman");
		MyThread t2=new MyThread(d,"Prakash");
		t1.start();
		t2.start();

	}

}
