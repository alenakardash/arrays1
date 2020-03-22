package com.company.training.array;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, 
то определить наименьшее из них.
*/

public class Task19 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 1, 14, 2, 2, 5, 14, 2, 1, 3, 6, 6, 14, 7, 8, 14, 7, 7, 7};
		
		int maxFrequency = 1;
		int maxFrequencyElement = arr[0];
		
		
		boolean ifSeveral = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			int x = arr[i];
			int xFrequency = 1;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] == x) {
					xFrequency++;
				}
				
				if (xFrequency > maxFrequency) {
					maxFrequency = xFrequency;
					maxFrequencyElement = arr[i];
				}
			}
			
		}

		int min = maxFrequencyElement;
		
			for(int k = 0; k < arr.length; k++) {
				
				int y = arr[k];
				int freq = 1;
				
				
				for(int l = k + 1; l < arr.length; l++) {
					
					if(arr[l] == y && arr[l] != maxFrequencyElement) {
						freq++;
					
					}
					if(freq == maxFrequency) {
						ifSeveral = true;
						if(arr[k] < min) {
							min = y;
						}						
						
					}
				}
						
				}
				
			
			if (ifSeveral) {
			    System.out.print("Минимальное число из встречающихся несколько раз = " + min);
		}
		else {
		    System.out.print("Наиболее часто встречающееся число = " + maxFrequencyElement);
		}
	}

}
