package com.neha.corejava;

import java.util.Scanner;

public class SeriesOfFactorial {

	public static void main(String[] args) {
		
		int num  , sum = 0;
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		for(int i = 1 ; i <= num ; i++) {
		int  fact = 1 ;
			for(int j = 1; j <= i ; j++) {
				fact = fact * j;
			}
			
		sum = sum + fact ;
	
		if(i != num) {
			System.out.print(i+"! +");
		}else {
			System.out.print(i+"! = "+sum);
		}

	}
		
		

}

}