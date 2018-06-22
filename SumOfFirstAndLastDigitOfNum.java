package com.neha.corejava;

import java.util.Scanner;

public class SumOfFirstAndLastDigitOfNum {
	
	public static void main(String args[])
	{
		int num , temp = 0 , sum = 0 , firstDigit  , lastDigit ;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		temp = num;
		
		lastDigit = num % 10 ;
		System.out.println("last digit is "+lastDigit);
		
		while(temp > 10)
		{
			temp = temp / 10;
			
		}
		
		firstDigit = temp % 10;
		
		System.out.println("first digit is "+firstDigit);
		sum =  firstDigit + lastDigit ;
		System.out.println("Sum of first and last digit is "+sum);
		
	}
}
