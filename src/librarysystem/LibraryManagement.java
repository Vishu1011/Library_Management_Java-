package librarysystem;

public class LibraryManagement {

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

    // Define the Member class
    public class Member {
        int memberId;
        String name;

        public Member(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }
    }


    //array to store Book and Member objects

     Book[] books=new Book[20];
    Member[] members=new Member[20];
    int numBook=0;
    int numMember=0;

    // Method to add a book
    public void addBook(String isbn, String title, String author, int availableCopies) {
        if (numBook < books.length) {
            books[numBook] = new Book(isbn, title, author, availableCopies);
            numBook++;
            System.out.println("Book added: ISBN " + isbn + ", Title " + title);
        } else {
            System.out.println("Book list  full.");
        }
    }

    // Method to add a member
    public void addMember(int memberId, String name) {
        if (numMember < members.length) {
            members[numMember] = new Member(memberId, name);
            numMember++;
            System.out.println("Member added: ID is " + memberId + ", Name is " + name);
        } else {
            System.out.println("Member list full.");
        }
    }

    // Method to display all books

    public void displayAllBooks()
    {

        if (numBook == 0) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("All Books list:");
        for (int i = 0; i < numBook; i++) {
            Book book = books[i];
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Available Copies: " + book.availableCopies);

        }

    }

    // Method to display all members
    public void displayAllMembers()
    {
        if (numMember == 0) {
            System.out.println("No members available.");
            return;
        }
        System.out.println("All Members:");
        for (int i = 0; i < numMember; i++) {
            Member member = members[i];
            System.out.println("Member ID: " + member.memberId);
            System.out.println("Name: " + member.name);

        }

    }

    //main method

    public static void main(String[] args) {

    LibraryManagement library=new LibraryManagement();

    //add book
    library.addBook("12345" , "data structure" , "vidhi" , 5);
    library.addBook("67891","computer networking" , "shubham" ,3);

    //add member
    library.addMember(1,"vidhi");
    library.addMember(2,"shubham");

    //display all books details

    library.displayAllBooks();

    //display all member details

    library.displayAllMembers();
    }


}
