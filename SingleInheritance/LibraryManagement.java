class Book{
	String title;
	int publicationYear;
	
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	void displayInfo(){
		System.out.println("Book Title: " + title);
		System.out.println("Publication Year: " + publicationYear);
	}
}

class Author extends Book{
	private String name;
	private String bio;
	
	Author(String title, int publicationYear, String name, String bio){
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Author Name: " + name);
		System.out.println("Bio: " + bio);
	}
}

public class LibraryManagement{
	public static void main(String[] args){
		Book book1 = new Author("Java", 2025, "Dhanraj", "Good Developer");
		book1.displayInfo();
	}
}