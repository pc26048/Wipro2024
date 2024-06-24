package com.rps;


interface a {
		int sub(int a,int b);
		default void meth() {
			System.out.println("Printing Default Method.....");
		}
}
interface b extends a{
		void meth();
}
class child implements a{
	public int sub(int a,int b) {
		return a-b;
	}
}

public class InterfaceDefaultMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c=new child();
		c.meth();
		System.out.println(c.sub(100, 50));
		

	}

}
