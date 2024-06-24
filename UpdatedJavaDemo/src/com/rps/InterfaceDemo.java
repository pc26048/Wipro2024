package com.rps;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> s=()->99;
		System.out.println(s.get());
		Consumer<Integer> c=(a)->System.out.println(a*a*a);
		c.accept(8);
		Predicate<Integer> p=(a)->a%2==0;
		System.out.println(p.test(10));
		Function<Integer,Integer>f=(a)->a*a;
		System.out.println(f.apply(5));

	}

}
