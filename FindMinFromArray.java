package com.neha.corejava;

import java.util.Scanner;

public class FindMinFromArray {

	public static void main(String[] args) {
		
		int size , min = 0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Array is ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			min = arr[0];
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("Min is "+min);

	}

}
