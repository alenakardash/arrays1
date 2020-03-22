package com.company.training.array;

// Дан одномерный массив A[N]. Найти: max(a2,a4...a2k )+min(a1,a3...a2k+1)

public class Task14 {
	
	public static void main(String[] args) {
		
		int[] mas = {1, 2, 13, 4, 5, 6, 7, 0, 9, 10};
		
		int max;
		int min;
		int result;
		
		max = findMax(mas);
		min = findMin(mas);
		
		result = max + min;
		
		System.out.print(result);
		
	}
	
	public static int findMax(int[] arr) {
		
		int max = arr[2];
		
		for(int i = 2; i < arr.length; i*=2) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public static int findMin(int[] arr) {
		
		int min = arr[1];
		
		for(int i = 1; i < arr.length; i = 2 * i + 1) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
