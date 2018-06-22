package com.neha.corejava;

import java.util.Scanner;

public class CheckPalindrome {
	
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
		
		if(ReverseNumber == originalNumber) {
			System.out.println(originalNumber+" is palindrome");
		}else {
			System.out.println(originalNumber+" is not palindrome");
		}
	}

}
