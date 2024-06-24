package com.rps;



class MyThread1 extends Thread{
	String d1;
	String d2;
	MyThread1(String d1,String d2){
		this.d1=d1;
		this.d2=d2;
		start();
	}
	public void run() {
		while(true) {
			synchronized(d2) {
				System.out.println(d1+d2);
			}
		}
	}
	
}
class MyThread2 extends Thread{
	String d1;
	String d2;
	MyThread2(String d1,String d2){
		this.d1=d1;
		this.d2=d2;
		start();
	}
	public void run() {
		while(true) {
			synchronized(d2) {
				System.out.println(d1+d2);
			}
		}
	}
}

public class ThreadDeadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t1="Dead";
		String t2="Lock";
		MyThread1 p=new MyThread1(t1,t2);
		MyThread2 p1=new MyThread2(t1,t2);
		

	}

}
