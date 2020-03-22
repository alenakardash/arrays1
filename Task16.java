package com.company.training.array;

// Даны действительные числа a1,a2 ... an . Найти max(a1 +a2n,a2 +a2n−1 ... an +an+1).

public class Task16 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 12, 3, 4, 50, 6, 7, 8, 9, 10};
		
		int maxSum;
		
		maxSum = arr[0] + arr[arr.length - 1];
		
		for(int i = 0; i < arr.length / 2; i++) {
			if(arr[i] + (arr[arr.length - 1 - i]) > maxSum) {
				
				maxSum = arr[i] + (arr[arr.length - 1 - i]);
			}
			
		}
		
		System.out.print(maxSum);
	}

}
