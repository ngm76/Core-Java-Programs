package com.neha.objectexample;

public class Circle {
	static double pi = 3.14;
	
	public static void main(String[] args) {
		
		CircleShape circle = new CircleShape();
		circle.setRadius(12);
		
		double area = pi * (circle.getRadius()) * (circle.getRadius()) ;
		System.out.println("Area of circle "+area);
		
		
		
	}
}
