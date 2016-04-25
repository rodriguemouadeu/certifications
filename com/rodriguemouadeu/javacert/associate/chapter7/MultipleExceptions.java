package com.rodriguemouadeu.javacert.associate.chapter7;

import java.io.*;

class MultipleExceptions {

	public static void main(String[] args){
		
		FileInputStream fis = null;
	
		try{
			fis = new FileInputStream("file.txt");
			System.out.println("File opened");
			fis.read();
			System.out.println("Read File");
	
		} catch (FileNotFoundException e){
	
			System.out.println("File not found");
	
		} catch (IOException ioe){
		
			System.out.println("File closing exception");
		
		} finally {
	
			System.out.println("finally");
	
		}
	
		System.out.println("Next task...");
	
	}
}
