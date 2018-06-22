package com.neha.corejava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num , next ;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		int first = 1 , second = 1 ;
		System.out.print(first+" "+second);
		for(int i = 3 ; i<=num ; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" "+next);
		}
		
	}

}
