package com.neha.corejava;

public class BubbleSort {

	public static void main(String[] args) {
		int k = 0;
		int arr[] = { 34, 23, 12, 56, 33, 2, 3, 89 };
		int n = arr.length;
		System.out.println("Given Array");
		for (int element : arr) {
			System.out.print(element + " ");
		}

		for (int i = 0; i < n; i++) {
			int flag = 0;
			int temp;
			for (int j = 0; j < n - k - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int element : arr) {
			System.out.print(element + " ");
		}

	}

}
