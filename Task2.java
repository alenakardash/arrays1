package com.company.training.array;

// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Task2 {
	
	public static void main(String[] args) {
		 int[] arr = {0, 1, 0, 34, 65, 77, 34, 0, 9, 0, 3, 5, 0};
		 
		 int[] zeroIndex;
		 
		 zeroIndex = selectZeroFromArray(arr);
		 
		 printIndexWithZeroVal(zeroIndex);
	}
	
	public static int[] selectZeroFromArray(int[] arr) {
		
		int[] zeroMas = new int[arr.length];
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeroMas[j] = i;
				j++;
			}
		}
		return zeroMas;
	}
	
	public static void printIndexWithZeroVal(int[] arr) {
			System.out.print(arr[0] + " ");	
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != 0) {
			System.out.print(arr[i] + " ");
			}
		}
	}

}
