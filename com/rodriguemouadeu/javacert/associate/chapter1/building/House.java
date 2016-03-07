package com.rodriguemouadeu.javacert.associate.chapter1.building;

import com.rodriguemouadeu.javacert.associate.chapter1.library.Book;

public class House{

	public House(){
	
		Book book = new Book();
		String isbn = book.isbn;
		book.printBook();

	}

}
