package com.neha.objectexample;

public class Rectangle {

	public static void main(String[] args) {
		
		RectShape shape = new RectShape();
		shape.setLength(20);
		shape.setBreadth(10);
		shape.setHeight(15);
		
		System.out.println("Area of rectangle is "+shape.Area());
		
		System.out.println("Volume of rectangle is "+shape.Volume());

	}

}
