package com.neha.corejava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int num , sum = 0 , originalNum;
		System.out.println("Enter the number to check if it is Armstrong number or not");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		originalNum = num;
		
		while(num != 0) {
			int a = num%10;
			sum = sum + (a*a*a);
			num = num/10;
			
			
		}
		if(originalNum == sum) {
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is not Armstrong");
		}

	}

}
