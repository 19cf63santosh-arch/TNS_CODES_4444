package com.tns.arrayex;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int intArr[]={ 10, 20, 15, 22, 35, 18 , 14 };
		
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);//sorted
		System.out.println(Arrays.toString(intArr));
		
		int key=22;
	System.out.println("the key was found at"+Arrays.binarySearch(intArr, key));
//get the second array
	
	int intArr1[]= {10, 15, 22};
	System.out.println(Arrays.toString(intArr1));
	
	//to compare the array
	if(Arrays.equals(intArr, intArr1))
	
		System.out.println("both the arrays are equal");
		else
			System.out.println("both the arrays are unequal");
	//creates a new array with a specified length, 
	
			System.out.println("\nNew Arrays by copyOf:\n");
			int intArr2[]=Arrays.copyOf(intArr, 10);
			System.out.println("Integer Array: " + Arrays.toString(intArr2));

			System.out.println("\nNew Arrays by copyOfRange:");
			// To copy the array into an array of new length
			int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
			System.out.println("Integer Array: " + Arrays.toString(intArr3));

			// To fill the arrays with key 22
			Arrays.fill(intArr, key);//replacing//
		
			System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));
		
	}

}


