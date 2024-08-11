package librarysystem;

public class BookManagement {

    //define Book class
    public class Book {
        String isbn;
        String title;
        String author;
        int availableCopies;

        // Constructor
        public Book(String isbn, String title, String author, int availableCopies) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.availableCopies = availableCopies;
        }
    }
//crate array
    Book[] b1= new Book[20];
    int numBooks;

    //add book
    public void addBook(String isbn, String title, String author, int availableCopies) {
        b1[numBooks] = new Book(isbn, title, author, availableCopies);
        numBooks++;
        System.out.println("Book added: " + title + " by " + author + " (ISBN: " + isbn + ")");
    }

    //findbook By ISBN number
    public int findBookByISBN(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            if (b1[i].isbn.equals(isbn)) {
                return i;
            }
        }
        return -1;
    }

    public void checkOutBook(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < b1.length && b1[bookIndex] != null) {
            if (b1[bookIndex].availableCopies > 0) {
                b1[bookIndex].availableCopies--;
                System.out.println("Book Checked Out: " + b1[bookIndex].title);
                System.out.println("Book available copies: " + b1[bookIndex].availableCopies);
            }
            else{
                System.out.println("No available copies for book " + b1[bookIndex].title);
            }
        }
        else {
            System.out.println("Book Index provided is Invalid");
        }
    }

    public void checkIn(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < b1.length && b1[bookIndex] != null) {
            b1[bookIndex].availableCopies++;
            System.out.println("Book Checked In: " + b1[bookIndex].title);
            System.out.println("Book available copies: " + b1[bookIndex].availableCopies);
        }
        else if(bookIndex > b1.length){
            System.out.println("Book Index provided is Invalid");
        }
    }


//print book details
    public void displayBookDetails (int bookIndex) {
        if (bookIndex >= 0 && bookIndex < b1.length) {
            BookManagement.Book book = b1[bookIndex];

            System.out.println("ISBN: " + book.isbn);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Available copies: " + book.availableCopies);

        }
        else  {
            System.out.println("Book Index Invalid");
        }
    }


    public static void main(String[] args) {

        BookManagement bookManagement = new BookManagement();

        bookManagement.addBook("12345", "java", "shubham", 2);
        bookManagement.addBook("56789", "c++", "vidh", 4);

        System.out.println("Book found at index: " + bookManagement.findBookByISBN("56789"));
        System.out.println("Book found at index: " + bookManagement.findBookByISBN("2222"));

        bookManagement.checkOutBook(0);
        bookManagement.checkOutBook(2);

        bookManagement.checkIn(4);
        bookManagement.checkIn(2);

        bookManagement.displayBookDetails(1);

    }



}
