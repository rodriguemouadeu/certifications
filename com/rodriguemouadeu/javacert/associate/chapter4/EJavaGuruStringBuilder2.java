package com.rodriguemouadeu.javacert.associate.chapter4;

import java.util.*;

public class EJavaGuruStringBuilder2  {

	public static void main(String[] args){

		StringBuilder sb = new StringBuilder("123456");
		System.out.println(sb);
		
		System.out.println(sb.subSequence(2, 4)); // ONLY returns a subset of array's elements. Doesn't modify the original value !!!
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.reverse());
	
		System.out.println(sb);

	}
}

