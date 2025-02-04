class Book{
	static String libraryName = "GLA";
	private String title;
	private String author;
	final int isbn;
	static void displayLibraryName(){
		System.out.println("Library Name: " + libraryName);
	}
	
	Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	void displayBookDetails(){
		if(this instanceof Book){
			System.out.println("Title: " + this.title);
			System.out.println("Author: " + this.author);
			System.out.println("ISBN: " + this.isbn);
		}
	}
}
public class LibraryManagementSystem{
	public static void main(String[] args){
		Book book1 = new Book("Java", "Dhanraj", 2115000354);
		Book.displayLibraryName();
		book1.displayBookDetails();
	}
}