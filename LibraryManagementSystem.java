import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem{
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Availability: " + (isAvailable ? "Available" : "Reserved"));
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    protected void setAvailable(boolean available){
        this.isAvailable = available;
    }
}

interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable{
    public Book(String itemId, String title, String author){
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration(){
        return 14;
    }

    @Override
    public void reserveItem(){
        if(checkAvailability()){
            setAvailable(false);
            System.out.println("Book reserved successfully.");
        }
		else{
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability(){
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable{
    public Magazine(String itemId, String title, String author){
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration(){
        return 7;
    }

    @Override
    public void reserveItem(){
        if(checkAvailability()){
            setAvailable(false);
            System.out.println("Magazine reserved successfully.");
        }
		else{
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability(){
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable{
    public DVD(String itemId, String title, String author){
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration(){
        return 5;
    }

    @Override
    public void reserveItem(){
        if(checkAvailability()){
            setAvailable(false);
            System.out.println("DVD reserved successfully.");
        }
		else{
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability(){
        return isAvailable();
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book1 = new Book("B001", "Java", "Dhanraj");
        Magazine mag1 = new Magazine("M001", "Rupayan", "Ankit");
        DVD dvd1 = new DVD("D001", "Latent", "Samay");

        libraryItems.add(book1);
        libraryItems.add(mag1);
        libraryItems.add(dvd1);

        for(LibraryItem item : libraryItems){
            item.getItemDetails();
            System.out.println();
        }

        book1.reserveItem();
        mag1.reserveItem();
        dvd1.reserveItem();

        book1.reserveItem();
    }
}
