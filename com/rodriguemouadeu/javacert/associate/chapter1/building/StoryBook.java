package com.rodriguemouadeu.javacert.associate.chapter1.building;

import com.rodriguemouadeu.javacert.associate.chapter1.library.Book;

public class StoryBook extends Book {

	StoryBook(){	
	
		printStoryBook();

	}

	public void printStoryBook(){

		Book book = new Book();		

		System.out.println(book.isbn);	
		System.out.println(book.author);
		book.modifyTemplate();	
	}
}
