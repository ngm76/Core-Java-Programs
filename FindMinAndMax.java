package com.neha.corejava;

import java.util.Scanner;

public class FindMinAndMax {

	public static int findMin(int arr[]) {
		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;

	}
	
	public static int findMax(int arr[]) {
		int max= arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;

	}
	
	
	public static void main(String[] args) {
		
		int size ;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Array is ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		char choice;
		
		do {
		System.out.println("Type \"m\" to find max of array ");
		System.out.println("Type \"n\" to find min of array ");
		System.out.println("Type \"e\" to exit");
		choice = sc.next().charAt(0);
		
		
		switch(choice) {
		
		case 'm' : System.out.println("Max number is "+findMax(arr));
					break;
		
					
		case 'n' : System.out.println("Min number is "+findMin(arr));
					break;				
					
		
		}
		
		}while(choice != 'e');
		sc.close();
	}

}
