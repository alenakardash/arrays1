package com.company.training.array;

/* Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке 
от L до N.
*/

public class Task13 {
	
	public static void main(String[] args) {
		int l = 10;
		int n = 80;
		int m = 10;
		int count = 0;
		
		for (int i = l; i <= n; i++) {
			if(i % m == 0) {
				count++;
			}
		}
		
		System.out.print("Количество элементов, кратных " + m + " = " + count );
		
	}

}
