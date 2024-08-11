
import java.util.Scanner;

public class test {

    private Book[] books = new Book[20];
    private Member[] members = new Member[20];
    private int numBooks = 0;
    private int numMembers = 0;

    // Inner class to represent a book in the library
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

        // Display book details
        public void displayBookDetails() {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Available Copies: " + availableCopies);
        }
    }

    // Inner class to represent a member of the library
    public class Member {
        int memberId;
        String name;

        // Constructor
        public Member(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        // Display member details
        public void displayMemberDetails() {
            System.out.println("Member ID: " + memberId + ", Name: " + name);
        }
    }

    // Method to add a book to the library
    public void addBook(String isbn, String title, String author, int availableCopies) {
        if (numBooks < books.length) {
            books[numBooks] = new Book(isbn, title, author, availableCopies);
            numBooks++;
            System.out.println("Book added: ISBN " + isbn + ", Title " + title);
        } else {
            System.out.println("Error: Book list is full.");
        }
    }

    // Method to add a member to the library with automatic ID generation
    public void addMember(String name) {
        if (numMembers < members.length) {
            int memberId = generateUniqueId();
            members[numMembers] = new Member(memberId, name);
            numMembers++;
            System.out.println("Member added: ID " + memberId + ", Name " + name);
        } else {
            System.out.println("Error: Member list is full.");
        }
    }

    // Generate a unique ID for each new member
    private int generateUniqueId() {
        return 1000 + numMembers;
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("All Books:");
        for (int i = 0; i < numBooks; i++) {
            books[i].displayBookDetails();
        }
    }

    // Method to display all members in the library
    public void displayAllMembers() {
        if (numMembers == 0) {
            System.out.println("No members available.");
            return;
        }
        System.out.println("All Members:");
        for (int i = 0; i < numMembers; i++) {
            members[i].displayMemberDetails();
        }
    }

    // Method to search for a book by title
    public void searchBooksByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                books[i].displayBookDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title: " + title);
        }
    }

    // Method to search for a book by author
    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].author.equalsIgnoreCase(author)) {
                books[i].displayBookDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author: " + author);
        }
    }

    // Main method to test the library management system
    public static void main(String[] args) {
        test library = new test();
        Scanner scanner = new Scanner(System.in);

        // Add some books to the library
        library.addBook("12345", "Data Structure", "Vidhi", 5);
        library.addBook("67891", "Computer Networking", "Shubham", 3);

        // Add some members to the library
        library.addMember("Vidhi");
        library.addMember("Shubham");

        // Display all books and members
        library.displayAllBooks();
        library.displayAllMembers();

        // Search for a book by title
        System.out.println("Enter the book title to search:");
        String title = scanner.nextLine();
        library.searchBooksByTitle(title);

        // Search for a book by author
        System.out.println("Enter the book author to search:");
        String author = scanner.nextLine();
        library.searchBooksByAuthor(author);

        // Close the scanner
        scanner.close();
    }
}