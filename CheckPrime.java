package com.neha.corejava;

public class CheckPrime {

	public static void main(String[] args) {
		
		int isPrime ;
		
		System.out.println("Prime Numbers between 1 to 100");
		
		for(int i = 2 ; i <= 100 ; i++)
		{
			isPrime = 0;
			for(int j = 2 ; j <= i/2 ; j++) 
			{
				if(i % j == 0) {
					isPrime = 1 ;
					break;
				}
			}
			if(isPrime == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
