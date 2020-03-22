package com.company.training.array;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task10 {
	
	public static void main(String[] args) {
		
		int[] arr = {0, 2, 2, 4, 3, 7, 9, 7, 9, 2, 14, 54};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > i) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
