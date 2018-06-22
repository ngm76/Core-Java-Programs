package com.neha.corejava;
import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

		int year;
		
		System.out.println("Enter the year to check whether it is leap year or not");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		sc.close();
		if(year % 400 == 0 && year % 4 == 0 ) {
			System.out.println(year + " is leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
		

	}

}
