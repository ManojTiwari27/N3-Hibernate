package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		
		//return total no.of books
		System.out.println("Total no.of books: "+service.getCount());
		
		//return specific book id
		System.out.println("Book with specific Id: "+service.getBookByIds(3));
		
		//price
		System.out.println("Price range between 300 to 600: "+service.getPrice(300f, 600f));
		
		//author name
		System.out.println("Book with specific author: "+service.getBooksAuthor("Yashwanth"));
		
		//return all the books
		System.out.println("All books: "+service.getAll());
	}

}