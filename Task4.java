package com.company.training.array;

// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Task4 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, -5, 6, 8, 56, 78};
		
		boolean ifIncreasing;
		
		ifIncreasing = ifIncrease(arr);
		
		printResult(ifIncreasing);
	}
	
	public static boolean ifIncrease(int[] arr) {
		 int count = 0;
		 boolean ifIncrease;
		 
		 for(int i = 0; i < arr.length - 1; i++) {
			 if(arr[i] > arr[i + 1]) {
				 count++;
				 break;
			 }
		 }
		 if(count == 0) {
			 ifIncrease = true;
		 }
		 else {
			 ifIncrease = false;
		 }
		 return ifIncrease;
	}
	
	public static void printResult(boolean ifIncrease) {
		if(ifIncrease) {
			System.out.print("Последовательность возрастающая");
		}
		else {
			System.out.print("Последовательность не возрастающая");
		}
	}

}
