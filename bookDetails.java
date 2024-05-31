package newbasicjava;

public class bookDetails {
	private String bookname, author;
	private int price, pages;
	private static int bookID = 1;
	private static int bookCount = 0;

	public bookDetails() {
		bookname = "lala lara lara";
		author = "bran dutta";
		price = 499;
		pages = 503;
	}

	public bookDetails(String bookname, String author, int price, int pages) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.pages = pages;
		bookCount++;
		//bookID=bookID+1;
	}
	public static String bookid ()
	{
		return "BID-0"+(bookID++);
	}
	public static int getBookCount() {
		return bookCount;
	}

	public void printDeatils() {
		System.out.println("The Book Deatils is as follows:");
		System.out.println("Book Name- " + bookname + "\tAuthor Name- " + author + "\tBook Price- " + price
				+ "\tBook Pages- " + pages + "\tBook ID- " + bookID);
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
