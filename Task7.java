package com.company.training.array;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. 
Подсчитать количество замен.
 */

public class Task7 {
	
	public static void main(String[] args) {
		
		int[] mas = {2, 4, 6, 3, 7, 9, 11, 56, 34, 88, 5, 3, 2, 1, 7};
		
		int z = 9;
		
		int count = 0;
		
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		printArray(mas);
		
		System.out.println("");
		
		System.out.println("Количество замен в массиве = " + count);
		
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
