package com.wipro;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
	
		
		LocalDate date=LocalDate.of(2023, 5, 15);
		
		System.out.println(date.isLeapYear());
		
	    LocalDate date1 =LocalDate.of(2024, 5, 25);
		
		System.out.println(date1.isLeapYear());
		
		LocalDate date2=date1.plusDays(10);
		LocalDate date3=date1.minusMonths(2);
		System.out.println(date2);
		System.out.println(date3);
		
		

	}

}
