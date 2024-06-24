package com.wipro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f1=new FileInputStream("/home/rps/InputStream/input.txt");
		FileOutputStream f2=new FileOutputStream("/home/rps/InputStream/output.txt");
		
		int d;
		while((d=f1.read())!=-1) {
			f2.write((char)d);
			System.out.print((char)d);
		}
		
		f1.close();
		f2.close();
		
	}

}
