package com.rps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerTestExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		List<Integer> arrlist=new ArrayList<>();
		for(int i=0;i<100;i++) {
			arrlist.add(new Random().nextInt());
			
		}
		System.out.println(arrlist);
		
		System.out.println(LocalDateTime.now());
		Worker worker =new Worker(arrlist);
		Thread t=new Thread(worker);
		t.join();
		System.out.println(LocalDateTime.now());

	}

}
