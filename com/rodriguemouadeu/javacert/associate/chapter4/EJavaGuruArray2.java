package com.rodriguemouadeu.javacert.associate.chapter4;

import java.util.*;

public class EJavaGuruArray2  {

	public static void main(String[] args){

		int array1[];
		int array2[] = new int[3];
		char[] array3 = {'a', 'b'};

		array1 = array2;
		array1 = array3;
		
		System.out.println(array1[0]+":"+array1[1]);
		
	}
}

