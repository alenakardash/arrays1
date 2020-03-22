package com.company.training.array;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task9 {
	
	public static void main(String[] args) {
		 int[] arr = {100, 5, 6, 3, 89, 5, -1, 3, 1, 0, 43};
		 
		 int maxIndex = findIndexOfMaxValue(arr);
		 int minIndex = findIndexOfMinValue(arr);
		 
		 int minValue = arr[findIndexOfMinValue(arr)];
		 
		 System.out.println(maxIndex);
		 System.out.println(minIndex);
		 
		 arr[minIndex] = arr[maxIndex];
		 
		 arr[maxIndex] = minValue;
         
		 
         printArray(arr);
	}
	
	public static int findIndexOfMinValue(int[] arr) {
		
		int min = arr[0];
		int indexOfMinValue = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				indexOfMinValue = i;
			}
		}
		return indexOfMinValue;
	}
	
    public static int findIndexOfMaxValue(int[] arr) {
		
		int max = arr[0];
		int indexOfMaxValue = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				indexOfMaxValue = i;
			}
		}
		return indexOfMaxValue;
	}
    
    public static void printArray(int[] arr) {
    	
    	for(int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    }

}
