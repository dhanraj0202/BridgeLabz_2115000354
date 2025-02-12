class Book{
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    Book(String title, String author, String genre, int bookId, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library{
    Book head, tail;
    int bookCount = 0;

    void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable){
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if(head == null){
            head = tail = newBook;
        }
		else{
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable){
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if(head == null){
            head = tail = newBook;
        }
		else{
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    void addAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position){
        if(position <= 0 || head == null){
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;
        for(int i = 1; temp.next != null && i < position; i++){
            temp = temp.next;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        if(temp.next != null){
            temp.next.prev = newBook;
        }
        temp.next = newBook;
        if(newBook.next == null){
            tail = newBook;
        }
        bookCount++;
    }

    void removeByBookId(int bookId){
        if(head == null){
			return;
		}
        if(head.bookId == bookId){
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            bookCount--;
            return;
        }
        Book temp = head;
        while(temp != null && temp.bookId != bookId){
            temp = temp.next;
        }
        if(temp != null){
            if(temp.next != null){
				temp.next.prev = temp.prev;
			}
            if(temp.prev != null){
				temp.prev.next = temp.next;
			}
            if(temp == tail){
				tail = temp.prev;
			}
            bookCount--;
        }
    }

    void searchByTitle(String title){
        Book temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.title.equalsIgnoreCase(title)){
                System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
			System.out.println("Book titled '" + title + "' not found.");
		}
    }

    void searchByAuthor(String author){
        Book temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.author.equalsIgnoreCase(author)){
                System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
			System.out.println("No books found by author '" + author + "'.");
		}
    }

    void updateAvailability(int bookId, boolean newStatus){
        Book temp = head;
        while(temp != null){
            if(temp.bookId == bookId){
                temp.isAvailable = newStatus;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward(){
        Book temp = head;
        while(temp != null){
            System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    void displayReverse(){
        Book temp = tail;
        while(temp != null){
            System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    int countBooks(){
        return bookCount;
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        Library library = new Library();

        library.addAtEnd("Java", "Dhanraj", "Coding", 101, true);
        library.addAtEnd("Python", "Krishan", "Coding", 102, false);
        library.addAtBeginning("Harry Potter", "JK Rowling", "Scifi", 103, true);
        library.addAtPosition("C++", "Rahul", "Coding", 104, true, 2);

        System.out.println("Library Books (Forward Order):");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());

        System.out.println("\nSearching for 'Harry Potter':");
        library.searchByTitle("Harry Potter");

        System.out.println("\nSearching for books by 'Krishan':");
        library.searchByAuthor("Krishan");

        System.out.println("\nUpdating Availability Status of Book ID 102:");
        library.updateAvailability(102, true);
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse Order):");
        library.displayReverse();

        System.out.println("\nRemoving Book ID 104:");
        library.removeByBookId(104);
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
