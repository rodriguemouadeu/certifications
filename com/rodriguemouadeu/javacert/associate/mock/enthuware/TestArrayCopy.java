package com.rodriguemouadeu.javacert.associate.mock.enthuware;

import java.lang.*;
import java.util.Arrays;

class TestArrayCopy {

	public static void main(String... args){


		int srcPos = Integer.parseInt(args[0]);
		int destPos = Integer.parseInt(args[1]);
		int length = Integer.parseInt(args[2]);

		System.out.println("Call arguments: srcPosition: " + srcPos + ", desPosition: " + destPos + ", length: " + length);		
	
		int arr1[] = { 0, 1, 2, 3, 4, 5 };
   		int arr2[] = { 0, 10, 20, 30, 40, 50 };
		
		System.out.println(Arrays.toString(arr1));    
		System.out.println(Arrays.toString(arr2));    

   		// copies an array from the specified source array
   		System.arraycopy(arr1, srcPos, arr2, destPos, length);
	
		System.out.println(Arrays.toString(arr1));    
		System.out.println(Arrays.toString(arr2));    
	}

}
