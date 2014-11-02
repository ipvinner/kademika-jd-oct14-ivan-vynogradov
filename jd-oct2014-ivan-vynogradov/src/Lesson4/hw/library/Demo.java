package Lesson4.hw.library;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books books = new Books(8, 3);
		
		//String[][] allBooks = books.allBooks();
		//books.showAllBooks();
		books.addBook("Kiosaki", "Bogatiy Papa - bedniy papa", "MONEY" );
		books.addBook("Starikov", "Spacenie dollara - voina", "HISTORY");
		books.addBook("Rend", "Atlant Raspravil Plechi", "FANTACY");
		books.addBook("Akunin", "Almaznaya Kolesnica", "DETECTIV");
		books.addBook("Fain", "Java Programming 24-Hour Trainer", "COMPUTERS");
		books.addBook("Akunin", "Turetskiy gambit", "DETECTIV");
		books.addBook("Kofler", "Linux - full rukovodstvo", "COMPUTERS" );
		books.addBook("Pushkin", "graf Nulin", "POEMA");
		//books.showAllBooks();
		//books.sortBooks();
		//Arrays.sort(books.getBooks(), Books.BooksNameComparator );
		//books.showAllBooks();
		//books.sortBooks("author");
		//System.out.println("AFTER sort by author");
		//books.showAllBooks();
		//books.sortBooks("name");
		//System.out.println("AFTER sort by book name");
		//books.showAllBooks();
		books.showAllBooksWithLimit(2);
		books.showAllBooksWithLimit(2);
		books.showAllBooksWithLimit(2);
		
	}

}
