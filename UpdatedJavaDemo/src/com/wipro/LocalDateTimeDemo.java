package com.wipro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime datetime=LocalDateTime.now();
		
		
		System.out.println("Output: "+datetime);
		
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String ans=f.format(datetime);
		System.out.println("After formatting date and time: "+ans);

	}

}
