package com.company.training.array;

// Дана последовательность действительных чисел a1,a2 ... an . Указать те ее элементы, которые принадлежат отрезку [с, d].

public class Task15 {
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 7, 4, 87, 45, 23, 1, 6, 0};
		
		int c = 2;
		int d = 6;
		
		int indexMin = c - 1;
		int indexMax = d - 1;
		
		for(int i = indexMin; i <= indexMax; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
