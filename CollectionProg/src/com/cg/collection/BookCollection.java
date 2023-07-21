package com.cg.collection;

import java.util.ArrayList;

public class BookCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> bookList=new ArrayList<>();
		
		bookList.add(new Book(100,"core java","Patrick Naughton",800));
		bookList.add(new Book(102,"Spring Framework","rod johnson",1000));
		bookList.add(new Book(101,"Hibernate","james thompson",1200));
		
		System.out.println("Book List");
		for(Book b: bookList) {
			System.out.println(b);
		}
	}

}
