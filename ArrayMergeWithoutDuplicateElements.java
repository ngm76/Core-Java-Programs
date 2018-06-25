package com.neha.corejava;

import java.util.Arrays;

public class ArrayMergeWithoutDuplicateElements {

	public static int[] mergeArray(int[] arr1 , int[] arr2) {
		int size = arr1.length + arr2.length ;
		int arr3[] = new int[size];
		
		System.arraycopy(arr1,0,arr3,0,arr1.length);
		System.arraycopy(arr2, 0 , arr3 , arr1.length , arr2.length);
		
		int length = arr3.length;
		
		for(int i = 0 ; i < length ; i++) {
			for(int j = i+1 ; j < length ; j++) {
				if(arr3[i] == arr3[j]) {
					arr3[j] = arr3[length-1];
					length--;
					j--;
				}
			}
		}
		
		int arr4[] = Arrays.copyOf(arr3, length);
		
		return arr4;
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7};
		int arr2[] = {2,4,6,8};
		
		System.out.println("Third array is");
		int arr[] = mergeArray(arr1 , arr2);
		
		for(int i : arr) {
			System.out.print(i+" ");
			 
		}
		
		
		


	}

}
