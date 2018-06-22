package com.neha.corejava;

public class Pattern5 {
	public static void main(String args[]){
		
        char c;
        for(int i = 1 ; i <= 6; ++i){
            c = 'A';
            for(int j = i ; j < 6 ;++j){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; ++k){
                System.out.print(c);
                ++c;
            }
            
            System.out.println();
        } 
    
	}
}