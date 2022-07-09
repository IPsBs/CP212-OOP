package lab7;

import java.util.*;
class LibraryTest {
	public static void main(String[] args) 
	{
		
		GregorianCalendar dueDate ;
		
		LibraryBook book1 ,book2 ,book3 ,book4;
		 
		 dueDate = new GregorianCalendar();
		
		book1 = new LibraryBook(dueDate);
		
		book2 = new LibraryBook(dueDate,0.75);
		
        book2.setTitle("introduction to oop with Java");

		
		 dueDate = new GregorianCalendar(2022,4,17);
		
		book3 = new LibraryBook(dueDate,1.00,100.00);
		
       		book3.setTitle("Java for Smarties");

		 
       		dueDate = new GregorianCalendar(2023,0,1);
		
		book4 = new LibraryBook(dueDate,1.00,100.00,"Me and My Java");
        
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
	}
}
