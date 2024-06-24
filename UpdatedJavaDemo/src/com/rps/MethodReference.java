package com.rps;


interface Drawable{
	void draw();
}
public class MethodReference {
	
	
	public static void circle(){
		System.out.println("Drawing a circle...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=MethodReference::circle;
		d.draw();
		

	}

}
