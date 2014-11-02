package Lesson4.hw.library;

import java.util.*;

public class Books {

	private String[][] books;
	private int booksQuantity;
	private int fieldsQuantity;
	private String author;
	private String name;
	private static int limit = 3;

	// private String[][] books = {
	// { "Robert Kiosaki", "Bogatiy Papa - bedniy papa", "MONEY" },
	// { "Nikokay Starikov", "Spacenie dollara - voina", "HISTORY" },
	// { "Ain Rend", "Atlant Raspravil Plechi", "FANTACY" },
	// { "Boris Akunin", "Almaznaya Kolesnica", "DETECTIV" },
	// { "Yakov Fain", "Java Programming 24-Hour Trainer", "COMPUTERS" },
	// { "Boris Akunin", "Turetskiy gambit", "DETECTIV" },
	// { "Mikhael Kofler", "Linux - full rukovodstvo", "COMPUTERS" },
	// { "Pushkin A.C.", "graf Nulin", "POEMA" } };

	public String[][] getBooks() {
		return books;
	}

	public String getName() {
		return name;
	}

	Books() {

	}

	Books(int booksQuantity, int fieldsQuantity) {
		this.books = new String[booksQuantity][fieldsQuantity];
		this.booksQuantity = booksQuantity;
		this.fieldsQuantity = fieldsQuantity;
	}

	public void addBook(String author, String name, String genre) {
		int lastIndex = getLastBookIndex();
		// System.out.println("lastIndex " + lastIndex);

		books[lastIndex][0] = author;
		books[lastIndex][1] = name;
		books[lastIndex][2] = genre;
		this.name = name;
		this.author = author;

	}

	private int getLastBookIndex() {
		for (int i = 0; i < booksQuantity; i++) {
			// System.out.println("books[i][0] " + books[i][0]);
			if (books[i][0] == null) {
				return i;
			}

		}
		return 0;
	}

	public String[][] allBooks() {
		return this.books;
	}

	public void showAllBooks() {
		if (books != null) {
			System.out
					.println("Author         |||Name                       |||Genre");
			for (String[] book : books) {
				for (String bookField : book) {
					System.out.print(bookField + " |||");
				}
				System.out.println();
			}
		} else {
			System.out.println("Library is empty");
		}
	}
	
	public void showAllBooksWithLimit(int limit) {
			System.out.println("getLimit " + getLimit());
			int fromIndex = this.getLimit() - limit;
			System.out.println("from Index " + fromIndex);
		if (books != null) {
			System.out.println("Author         |||Name                       |||Genre");
			for(int i = fromIndex; i < (fromIndex + limit); i++){
				for(int j = 0; j < books[i].length; j++){
					System.out.print("[ " + books[i][j] + " ]" + " ");
				}
				System.out.println();
			}
			updateLimit(limit);
	}else {
			System.out.println("Library is empty");
		}
	}

	public void sortBooks(String sortBy) {
		if (sortBy.equals("author")) {
			Arrays.sort(books, new ColumnComparator(0));
		} else if (sortBy.equals("name")) {
			Arrays.sort(books, new ColumnComparator(1));
		} else if (sortBy.equals("genre")){
			Arrays.sort(books, new ColumnComparator(2));
		}
	}
	
	private void updateLimit(int limit1){
		//System.out.println(limit);
		this.setLimit(this.getLimit() + limit1);
	}

	public static int getLimit() {
		return limit;
	}

	public static void setLimit(int limit) {
		Books.limit = limit;
	}
}
