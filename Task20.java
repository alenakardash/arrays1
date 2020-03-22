package com.company.training.array;

/* Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент 
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

public class Task20 {
	
	public static void main(String[] args) {
		 int[] arr = {2, 4, 3, 6, 5, 3, 1, 7, 8, 4, 1};
		 
		 for(int i = 1; i < arr.length; i+= 2) {
			 arr[i] = 0;
		 }
		 
		 printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
