package newbasicjava;

import java.util.Scanner;

public class bookInfoz {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String bookname,author;
		int price,pages; 
		
		System.out.print("Enter Book Name");
		bookname = scan.next();
		System.out.print("Enter Author Name");
		author = scan.next();
		System.out.print("Enter Book Price");
		price = scan.nextInt();
		System.out.print("Enter Book Number of pages");
		pages = scan.nextInt();
		
		bookDetails book1,book2;
		book1 = new bookDetails();
		book2 = new bookDetails("Gaban","Munshi Premchand",299,449);
		bookDetails book3 = new bookDetails(bookname,author,price,pages);
		book1.printDeatils ();
		book2.printDeatils ();
		book3.printDeatils ();
		bookDetails.bookid();
		
		System.out.println("total number of books: "+bookDetails.getBookCount());
		
	}
}
