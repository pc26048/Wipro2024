package com.rps;

import java.util.Scanner;

public class PrimeNumber {
	
	
	static boolean isPrime(int n){
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(isPrime(num)) {
		System.out.println("Prime No");
		}
		else {
			System.out.println("Not Prime");
		}
		

	}

}
