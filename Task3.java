package com.company.training.array;

// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.

public class Task3 {
	
	public static void main(String[] args) {
		
		int[] mas = {2, -3, 4, 0, 5, -5, 70, 33};
	
	
	if(mas[0] > 0) {
		System.out.print("Первым встречается положительное число");
	}
	else if(mas[0] == 0) {
		System.out.print("Первым встречается 0");
	}
	else {
		System.out.print("Первым встречается отрицательное число");
	}

	}
}
