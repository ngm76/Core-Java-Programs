package com.neha.corejava;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int marks[] = new int[6];
		System.out.println("Enter the marks of the student");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < marks.length ; i++) {
			marks[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Marks of 6 subjects of a student are");
		
		for(int mark : marks) {
			System.out.print(mark+" ");
		}
		
		System.out.println();
		
		System.out.print("Sum of Marks of 6 subjects of a student are ");
		
		for(int mark : marks) {
			sum = sum + mark;
		}
		System.out.print(sum);
	}

}
