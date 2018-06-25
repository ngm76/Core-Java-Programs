package com.neha.corejava;

import java.util.Scanner;

public class SearchNameInArray {

	public static void main(String[] args) {
		
		String empNames[] = {"Neha" , "Sneha" ,"Neo" , "Jyoti" , "Prasad" , "Akash" , "Akshay"};
		System.out.println("Array of Strings is");
		for(String a : empNames) {
			System.out.println(a);
			}
		
		System.out.println("Which name you want to search");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		sc.close();
		
		for(String s : empNames) {
			if(s.equalsIgnoreCase(searchName)) {
				System.out.println(searchName+" is present in array");
				break;
			}else {
				System.out.println(searchName+" is not present in array");
				break;
			}
		}

	}

}
