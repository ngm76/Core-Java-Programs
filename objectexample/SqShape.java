package com.neha.objectexample;

public class SqShape {
	private int side ;
	
	public void setSide(int side) {
		this.side = (side > 0)?side:0;
	}
	
	public int getSide() {
		return side;
	}
	
	public int Area() {
		return (side*side);
	}
	
	public int Volume() {
		return (side*side*side);
}
	
	
}
