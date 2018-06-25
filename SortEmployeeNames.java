package com.neha.corejava;

public class SortEmployeeNames {

	public static void main(String[] args) {
		
		String empNames[] = {"Neha" , "Sneha" ,"Neo" , "Jyoti" , "Prasad" , "Akash" , "Akshay"};
		
		for(int i = 0 ; i < empNames.length ; i++) {
			for(int j = 0 ; j < empNames.length ; j++) {
				if((empNames[i].compareTo(empNames[j])) < 0 ) {
					String temp = empNames[i];
					empNames[i] = empNames[j];
					empNames[j] = temp;
					
				}
			}
		}
		
		System.out.println("After Sorting");
		for(String a : empNames) {
		System.out.println(a);
		}
		
 		
	}

}
