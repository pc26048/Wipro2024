package com.rps;

class T1 extends Thread {
	public void run() {
		try {
			for(int i=1;i<6;i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
				
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		for(int i=0;i<+6;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
			}
		T1 t1=new T1();
		t1.setName("Wiproemp1");
		T1 t2=new T1();
		t2.setName("Wiproemp2");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.activeCount());

	}

}
