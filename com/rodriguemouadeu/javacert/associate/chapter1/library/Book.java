package com.rodriguemouadeu.javacert.associate.chapter1.library;

public class Book{

	public String isbn = "0123456789";
	protected String author = "Bob Gratton";

	public void printBook(){
		System.out.println(isbn);	
	}

	protected void modifyTemplate(){
		System.out.println("mofifyTeplate() called ...");
	}

}
