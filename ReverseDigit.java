package com.neha.corejava;

import java.util.Scanner;

public class ReverseDigit {
	
	public static void main(String args[]) {
	int num , originalNumber , ReverseNumber = 0;
	
	System.out.println("Enter the number ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	sc.close();
	originalNumber = num;
	
	while(num !=  0) {
		int a = num % 10 ;
		ReverseNumber = (ReverseNumber * 10)+a;
		num = num/10;
	}
	
	System.out.println("Reverse Of "+originalNumber+" is "+ReverseNumber);
} 
}
