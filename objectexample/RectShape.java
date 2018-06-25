package com.neha.objectexample;

public class RectShape {
	private int length ;
	private int breadth ;
	private int height ;
	
	
	public void setLength(int l) {
		length = (l>0)?l:1;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setBreadth(int b) {
		breadth = (b>0)?b:1;
	}
	
	
	public int getBreadth(){
		return breadth;
	}
	
	public void setHeight(int h) {
		height = (h>0)?h:1;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int Volume() {
		return length*breadth*height;
	}
	
	public int Area(){
		return length * breadth ;
	}
	
	
}
