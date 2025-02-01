class BookDetails{
	private String title;
	private String author;
	private int price;
	
	BookDetails(){
		title = "Java";
		author = "Dhanraj";
		price = 400;
	}
	
	BookDetails(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayBookDetails(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}
public class Book{
	public static void main(String[] args){
		BookDetails book1 = new BookDetails();
		book1.displayBookDetails();
		BookDetails book2 = new BookDetails("Python", "Rahul", 300);
		book2.displayBookDetails();
	}
}