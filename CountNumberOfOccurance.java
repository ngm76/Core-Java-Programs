package com.neha.corejava;
import java.util.Scanner;

public class CountNumberOfOccurance {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,0,3,4,2,2,2,};
		
		int count = 0;
		
		System.out.println("Array is");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("Occurance of which number you want to know");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println();
		
		for(int i : arr) {
			if(i == num) {
				count++;
			}
		}
		
		System.out.println("Number of occurance of "+num+" is "+count);
				
		
	}

}
