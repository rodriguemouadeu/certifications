package com.rodriguemouadeu.javacert.associate.chapter7;

import java.io.*;

class MultipleReturnModifyPrimitive {


	public static void main(String[] args){
		MultipleReturnModifyPrimitive var = new MultipleReturnModifyPrimitive();
		System.out.println(var.getInt());
	}

	int getInt(){
		int returnVal = 10;
		String[] students = new String[]{"Paul","Harry"};
		
		try{
			System.out.println(students[5]);
	
		} catch (Exception e){
			System.out.println("catch returnVal:"+returnVal);
			return returnVal;			
		} finally {
			returnVal += 10;
			System.out.println("finally returnVal:" + returnVal);
 		}
		
		return returnVal;	
	}
}
