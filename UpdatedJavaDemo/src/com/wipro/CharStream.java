package com.wipro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader f1=new FileReader("/home/rps/InputStream/input.txt");
		BufferedReader b1=new BufferedReader(f1);
		FileWriter f2=new FileWriter("/home/rps/InputStream/output11.txt");
		
		BufferedWriter b2=new BufferedWriter(f2);
		
		
		String k=null;
		while((k=b1.readLine())!=null) {
			System.out.print(k);
			b2.write(k);
		}
		
		f1.close();b1.close();
		b2.close();f2.close();
		
		
	}

}
