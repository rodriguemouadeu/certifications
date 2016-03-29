package com.rodriguemouadeu.javacert.associate.chapter4;

import java.util.*;

public class EJavaGuruStringBuilder  {

	public static void main(String[] args){

		StringBuilder sb = new StringBuilder(10+2+"SUN"+4+5);
		System.out.println(sb);
		
		StringBuilder partial = sb.delete(3,6);
		System.out.println(partial);
		
		sb.append(partial);
		System.out.println(sb);

	}
}

