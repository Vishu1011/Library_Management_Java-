
# BookManagement :

Create a structure named Book with the following fields:

isbn: String

title: String

author: String

availableCopies: int

Implement the following functions:

addBook(String isbn, String title, String author, int copies): Adds a book to the library.

findBookByISBN(String isbn): Returns the index of the book with the given ISBN in the book array, or -1 if not found.

checkOutBook(int bookIndex): Decrements the availableCopies of a book at the given index.

checkInBook(int bookIndex): Increments the availableCopies of a book at the given index.

displayBookDetails(int bookIndex): Prints the details of the book at the given index. 


# MemberManagement


Create a structure named Member with the following fields:

memberId: int

name: String

Implement the following functions:

addMember(int memberId, String name): Adds a member to the library.

findMemberById(int memberId): Returns the index of the member with the given ID in the member array, or -1 if not found.

displayMemberDetails(int memberIndex): Prints the details of the member at the given index. 


# LibraryManagement

Combine the Book and Member structures from the previous assignments.

Implement the following functions:

displayAllBooks(): Prints details of all books in the library.

displayAllMembers(): Prints details of all members in the library. 


# EnhancedLibraryManagement

Search books by title and author.

Implement error handling for invalid operations (e.g., checking out a book that is not available, finding a book or member that doesn't exist).

Generate unique member IDs automatically.

Consider additional features like book reservations, due dates, and fines.

