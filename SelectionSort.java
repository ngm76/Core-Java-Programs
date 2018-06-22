package com.neha.corejava;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {34,23,56,1,2,8};
		
		for(int i = 0 ; i < arr.length ; i++) {
			int minIndex = i ;
			
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j ;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		for(int element : arr) {
			System.out.print(element +"  ");
		}
 
	}

}
