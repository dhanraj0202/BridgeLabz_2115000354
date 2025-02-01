class Book{
	private String title;
	private String author;
	private int price;
	private boolean isAvailable;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = true;
	}
	
	public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
public class Library{
	public static void main(String[] args){
		Book book1 = new Book("Python", "Rahul", 300);
		System.out.println("Is the book available? " + book1.isAvailable());

        if(book1.borrowBook()){
            System.out.println("Book borrowed successfully!");
        }
		else{
            System.out.println("Book is not available.");
        }

        System.out.println("Is the book available? " + book1.isAvailable());

        book1.returnBook();
        System.out.println("Is the book available? " + book1.isAvailable());
	}
}