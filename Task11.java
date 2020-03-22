package com.company.training.array;

//  Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

public class Task11 {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 3, 7, 88, 54, 34, 23, 1, 0, 7, 9, 77, 16, 13};
		
		int m = 3;
		
		for(int num : arr) {
			if(num % m > 0 && num % m < m - 1) {
				System.out.print(num + " ");
			}
		}
	}

}
