package com.wipro;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime t=LocalTime.now();
		
		System.out.println("Current Time: "+t);
		
		LocalTime time=LocalTime.of(8, 55, 34);
		
		System.out.println(time);
		LocalTime time1 =time.minusMinutes(10);
		System.out.println("Subtracting 10 min: "+time1);
		
		

	}

}
