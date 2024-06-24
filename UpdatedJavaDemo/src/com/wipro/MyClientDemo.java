package com.wipro;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Socket client =new Socket("localhost",5001);
			DataOutputStream dout=new DataOutputStream(client.getOutputStream());
			dout.writeUTF("Hello Server, How do u do");
			dout.flush();
			dout.close();
			client.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
