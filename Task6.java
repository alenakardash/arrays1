package com.company.training.array;

// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class Task6 {
	
	public static void main(String[] args) {
		
		int[] mas = {3, 5, 6, 7, -8, 9, 1, 0, 4, -3};
		
		int max;
		max = maxValueFromArray(mas);
		
		int min;
		min = minValueFromArray(mas);
		
		int result;
		result = axisLength(max, min);
		
		System.out.print(result);
		
		}
	
	public static int minValueFromArray(int[] arr) {
		int min = arr[0];
		
		for(int number : arr) {
			if(number < min)
				min = number;		
			}
		return min;
		}
	
	public static int maxValueFromArray(int[] arr) {
		int max = arr[0];
		
		for(int number : arr) {
			if(number > max)
				max = number;		
			}
		return max;
		}
	
	public static int axisLength(int max, int min) {
		int axis;
		
		axis = max - min;
		
		return axis;
	}

}
