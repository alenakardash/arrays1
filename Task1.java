package com.company.training.array;

import java.util.Random;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
	
	public static void main(String[] args) {
		
		int k = 3;
		int[] mas;
		
		mas = createArray(10);
		
		int sum;
		
		sum = calcSum(mas, k);
		
		printResult(sum, k);
	}
 
	public static int[] createArray(int elemNumber) {
		Random ran = new Random();
		
		int arr[] = new int[elemNumber];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
		}
		return arr;
	}
	
	public static int calcSum(int arr[], int k) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % k == 0) {
				sum+= arr[i];
			}			
		}
		return sum;
	}
		
	public static void printResult(int res, int k) {
		System.out.print("Сумма элементов массива, кратных " + k + " = " + res);
	
	}

}
