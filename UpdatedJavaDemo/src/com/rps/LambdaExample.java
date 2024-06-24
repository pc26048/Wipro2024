package com.rps;

public class LambdaExample {
	
	
	@FunctionalInterface
	interface Addable{
		int add(int a,int b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ans=(a,b)->a+b;
		System.out.println(ans.add(10, 20));
		
	}

}
