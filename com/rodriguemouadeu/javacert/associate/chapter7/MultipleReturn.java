package com.rodriguemouadeu.javacert.associate.chapter7;

import java.io.*;

class MultipleReturn {


	public static void main(String[] args){
		MultipleReturn var = new MultipleReturn();
		System.out.println(var.getInt());
	}

	int getInt(){
		String[] students = new String[]{"Paul","Harry"};
		
		try{
			System.out.println(students[5]);
	
		} catch (Exception e){
			return 10;			
		} finally {
			return 20;
 		}
	
	}
}
