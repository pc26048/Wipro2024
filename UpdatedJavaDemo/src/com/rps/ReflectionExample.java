package com.rps;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class LoanDemo {
	private int age;
	Integer id;
	double amount;

	public LoanDemo(double amount, Integer id) {
		super();
		this.amount = amount;
		this.id = id;
	}

	LoanDemo() {

	}

	public LoanDemo(double amount) {
		super();
		this.amount = amount;
	}
	
	public int getEmi(Integer amount) {
		return amount/12;
	}

	public void deposit(Double amount) {

	}

	public void withdraw(Double amount) {

	}
}

public class ReflectionExample {

	public static void main(String[] args) throws Exception ,InterruptedException{
		// TODO Auto-generated method stub

		Class<LoanDemo> c = LoanDemo.class;
		Field d = c.getDeclaredField("age");
		System.out.println(d);
		Constructor con[] = c.getConstructors();
		for(Object c1 : con) {
			System.out.println(c1);
		}
		Method m[] = c.getMethods();

		for (Object m1 : m) {
			System.out.println(m1);
		}

	}

}
