package com.neha.objectexample;

public class Square {
	public static void main(String[] args) {
		SqShape square  = new SqShape();
		
		square.setSide(25);
		
		System.out.println("Area of square is "+square.Area());
		System.out.println("Volume of square is "+square.Volume());
	}
}
