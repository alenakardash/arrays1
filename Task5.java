package com.company.training.array;

/* Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
*/

public class Task5 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 3, 5, 21, 3, 50, 61, 9, 8, 81, 61};
		
		int[] chetMas = createArrayChet(arr);
		
		printArray(chetMas);
		
	}
	
	public static int[] createArrayChet(int[] arr) {
		
		int j = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
			
			if(count == 0) {
				System.out.print("Нет ни одного четного числа");
				System.exit(0);
			}
			
			int[] masChet = new int[count];
			
			for(int i = 0; i < arr.length; i++) {
				
			if(arr[i] % 2 == 0) {
				masChet[j] = arr[i];
				j++;
			}
			}
			return masChet;
		}
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	}


