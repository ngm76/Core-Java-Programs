package com.neha.corejava;
import java.util.Scanner;

public class FindMaxFromArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max = 0;
		
		System.out.println("Enter the array elements");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0 ; i < arr.length ; i++) {
			max = arr[0];
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Array is ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Max number is "+max);
		
	}

}
