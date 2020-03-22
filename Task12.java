package com.company.training.array;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task12 {
	
	 public static void main(String[] args) {
		 
	int[] arr = {2, 1, 5, 7, 4, 7, 2, 8, 8, 9, 0, 2, 12};
	
	int sum = 0;

	for(int i = 2; i <= arr.length; i++) {
		if (ifSimple(i)) {
			sum += arr[i - 1];
		}
		
	}
	System.out.print(sum);
		 
	 }

	 
	 public static boolean ifSimple(int x) {
		  boolean ifSimple = false;
		  
		  if(x > 2) {
		  
		  for(int i = 2; i <= x - 1; i++) {
			  if(x % i == 0) {
				  ifSimple = false;
				  break;
			  }
			  else {
				  ifSimple = true;
			  }
		  }
		
		  }
		  else if(x == 2) {
			  ifSimple = true;
		  }
		  else {
			  ifSimple = false;
		  }
		  return ifSimple;
	 }
}
