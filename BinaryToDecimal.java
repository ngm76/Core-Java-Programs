package com.neha.corejava;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
	
		int num , i = 1 , decimal = 0 ;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		while(num != 0) {
			int a = num % 10;
			decimal = decimal + (a * i);
			i = i * 2;
			num = num/10;
		}
		System.out.println("Decimal No is "+decimal);

	}

}
