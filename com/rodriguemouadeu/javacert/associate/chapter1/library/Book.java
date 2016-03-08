package com.rodriguemouadeu.javacert.associate.chapter1.library;

class Book{

	public String isbn = "0123456789";
	protected String author = "Bob Gratton";
	int issueCount;

	public void printBook(){
		System.out.println(isbn);	
	}

	protected void modifyTemplate(){
		System.out.println("mofifyTeplate() called ...");
		countPages();
	}

	void issueHistory(){
	}

	private int countPages(){
		System.out.println("countPages() called ...");
	}

}
