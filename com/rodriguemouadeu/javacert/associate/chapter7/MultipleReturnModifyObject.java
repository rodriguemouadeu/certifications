package com.rodriguemouadeu.javacert.associate.chapter7;

import java.io.*;

class MultipleReturnModifyObject {


	public static void main(String[] args){
		MultipleReturnModifyObject var = new MultipleReturnModifyObject();
		System.out.println("In main:" + var.getInt());
	}

	StringBuilder getInt(){
		StringBuilder returnVal = new StringBuilder("10");
		String[] students = new String[]{"Paul","Harry"};
		
		try{
			System.out.println(students[5]);
	
		} catch (Exception e){
			System.out.println("catch returnVal:" + returnVal);
			return returnVal;			
		} finally {
			returnVal.append("10");
			System.out.println("Return value in finally is now:" + returnVal);
 		}
		
		return returnVal;
	}
}
