package com.rodriguemouadeu.javacert.associate.chapter4;

import java.util.*;

public class EJavaGuruArrayList_4_6  {

	public static void main(String[] args){

		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		System.out.println(list);
		
		System.out.println("list.contains(new String(\"One\")) : " +  list.contains(new String("One")));
		System.out.println("list.contains(\"One\") : " +  list.contains("One"));

		//System.out.println(list.contains(new String("One")));
		System.out.println(list.indexOf("Two"));
		list.clear();

		System.out.println(list);
		
		System.out.println(list.get(1));

	}
}

