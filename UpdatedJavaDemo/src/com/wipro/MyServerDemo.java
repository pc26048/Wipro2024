package com.wipro;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ServerSocket server=new ServerSocket(5001);
			Socket s=server.accept();
			DataInputStream data=new DataInputStream(s.getInputStream());
			
			String str=(String)data.readUTF();
			
			System.out.println("Message from the server: "+str);
			
			server.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
