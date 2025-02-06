import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}

class Library{
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        for(Book book : books){
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class LibraryAndBooks{
    public static void main(String[] args){
        Book book1 = new Book("JAVA", "Dhanraj");
        Book book2 = new Book("Python", "Rahul");
        Book book3 = new Book("C++", "Ankit");

        Library library1 = new Library();
        Library library2 = new Library();

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        System.out.println("Library 1 Books:");
        library1.displayBooks();

        System.out.println("Library 2 Books:");
        library2.displayBooks();
    }
}
