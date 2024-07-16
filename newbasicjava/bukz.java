package newbasicjava;

class bukz {
    private static int idCounter = 1000; // Static variable to keep track of the last generated book ID
    private static int bookCount = 0; // Static variable to keep track of the number of books created

    private String bookId;
    private String bookName;
    private String author;
    private double price;
    private int pages;

    // Constructor to initialize book details
    public bukz(String bookName, String author, double price, int pages) {
        this.bookId = generateBookId();
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.pages = pages;
        bookCount++;
    }

    // Static method to generate book ID
    private static String generateBookId() {
        return "BID" + (idCounter++);
    }

    // Static method to get the total number of books created
    public static int getBookCount() {
        return bookCount;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create book objects
    	bukz book1 = new bukz("The Alchemist", "Paulo Coelho", 299.99, 208);
    	bukz book2 = new bukz("To Kill a Mockingbird", "Harper Lee", 399.99, 324);
    	bukz book3 = new bukz("1984", "George Orwell", 249.99, 328);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

        // Display total number of books created
        System.out.println("Total number of books created: " + bukz.getBookCount());
    }
}

