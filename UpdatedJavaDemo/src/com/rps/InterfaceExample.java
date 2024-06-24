package com.rps;


interface calculate{
	int add(int c,int c1);
	int mul(int d,int d1);
	
}

class demo implements calculate{
	public int add(int c,int c1) {
		return c+c1;
	}

	@Override
	public int mul(int d, int d1) {
		// TODO Auto-generated method stub
		return d*d1;
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d=new demo();
		System.out.println(d.add(100,200));
		System.out.println(d.mul(20, 30));

	}

}
