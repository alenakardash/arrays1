package com.company.training.array;


// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task8 {
	
	public static void main(String[] args) {
		
		int[] mas = {-1, 0, 5, 7, 4, 89, 0, -5, 0, 44, 65, 23, -9, 2, 0};
		
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] < 0) {
				countNegative++;
			}
			else if(mas[i] == 0) {
				countZero++;
			}
			else {
				countPositive++;
			}
			
		}
		System.out.println("Количество положительных элементов массива = " + countPositive);
		System.out.println("Количество отрицательных элементов массива = " + countNegative);
		System.out.println("Количество нулевых элементов массива = " + countZero);
		
	}


}
