package Lesson4.hw.library;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
				
		// Create Library
		Books books = new Books(11, 3);
		
		books.addBook("Kiosaki", "Bogatiy Papa - bedniy papa", "MONEY" );
		books.addBook("Starikov", "Spacenie dollara - voina", "HISTORY");
		books.addBook("Rend", "Atlant Raspravil Plechi", "FANTACY");
		books.addBook("Akunin", "Almaznaya Kolesnica", "DETECTIV");
		books.addBook("Fain", "Java Programming 24-Hour Trainer", "COMPUTERS");
		books.addBook("Akunin", "Turetskiy gambit", "DETECTIV");
		books.addBook("Kofler", "Linux - full rukovodstvo", "COMPUTERS" );
		books.addBook("Pushkin", "graf Nulin", "POEMA");
		books.addBook("Hill", "Think and Grow Rich", "MONEY");
		books.addBook("Duma", "Graph Monte Cristo", "ROMAN");
		books.addBook("Lermontov", "Borodino", "PROZA");
		
		books.showAllBooks();
		System.out.println("---------AFTER sort by author-------------");
		books.sortBooks("author");
		System.out.println("---------AFTER sort by book name-----------");
		books.sortBooks("name");
		System.out.println("---------AFTER sort by genre with LIMIT-----------");
		books.sortBooksWithLimit("genre", 3);
		books.sortBooksWithLimit("genre", 3);
		books.sortBooksWithLimit("genre", 3);
		
		//books.showAllBooks();
//		books.showAllBooksWithLimit(3);
//		books.showAllBooksWithLimit(3);
//		books.showAllBooksWithLimit(2);
		
	}

}
