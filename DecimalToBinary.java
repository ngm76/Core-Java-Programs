package com.neha.corejava;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		int binary[] = new int[20];
		int index = 0;
		
		while(num > 0) {
			binary[index++] = num%2;
			num = num / 2;
		}
		
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(binary[i]);
		}

	}

}
