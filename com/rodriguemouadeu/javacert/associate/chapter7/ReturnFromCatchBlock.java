package com.rodriguemouadeu.javacert.associate.chapter7;

import java.io.*;

class ReturnFromCatchBlock {

	public static void main(String[] args){
		openFile();
	}

	private static void openFile(){
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("file.txt");
			System.out.println("File opened");
	
		} catch (FileNotFoundException e){
	
			System.out.println("File not found");
			
			return;			

		} finally {
	
			System.out.println("finally");
	
		}
	
		System.out.println("Next task...");
	
	}
}
