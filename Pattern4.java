package com.neha.corejava;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 6 ; i++ ) {
			
			for(int j = 0 ; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 5 ; k >= 6-i ; k-- ) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
