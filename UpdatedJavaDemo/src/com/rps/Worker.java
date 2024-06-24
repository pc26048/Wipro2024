package com.rps;

import java.util.Collections;
import java.util.List;

public class Worker implements Runnable{
	
	List<Integer>list;
	public Worker(List<Integer> list) {
		this.list=list;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		Collections.sort(list);
		
	}
	
	

}
