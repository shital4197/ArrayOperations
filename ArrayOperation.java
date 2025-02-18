package com.arrayexample;

public class ArrayOperation {

	public static void main(String[] args) {
		
		int arr[] = {4,12,5,33,75,20,18,31,9,61};    // intialization and declaration of an array
		
		int addition = 0;
		int subtraction = 0;
		int multiplication = arr[0];
		int division = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			addition += arr[i];
			multiplication *=arr[i];
			System.out.println(arr[i]);
			
			if(i>0) {
				subtraction -= arr[i];
				  if(arr[i]!= 0) {
					  division/= arr[i];
				  }
				  else {
					  System.out.println("Cannot divided by zero!..");
					  return;
				  }
			}
		}
		
		// Display results
		System.out.println("Addition of an elements: "+ addition);
		System.out.println("Multiplication of an elements: "+ multiplication);
		System.out.println("Subtraction of an elements: "+ subtraction);
		System.out.println("Division of an elements: "+ division);

	}

}
