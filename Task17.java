package com.company.training.array;

/* Дана последовательность целых чисел a1, a2 ... an. Образовать новую последовательность, выбросив из исходной те члены, 
которые равны min(a1, a2 ... an).
*/

public class Task17 {
	
	public static void main(String[] args) {
		
		int[] arr = {0, 2, 9, 5, 3, 0, 4, 3, 2, 1, 7, 0, 4, 7};
		
		int[] mas = new int[11];
		
		int j = 0;
		
		int arrayMin;
		
		arrayMin = findMin(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != arrayMin) {
				mas[j] = arr[i];
				j++;
			}
		}
		
		printArray(mas);
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i] + " ");
		}
	}

}
