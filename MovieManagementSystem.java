class Movie{
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList{
    Movie head, tail;

    void addAtBeginning(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null){
            head = tail = newMovie;
        }
		else{
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    void addAtEnd(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null){
            head = tail = newMovie;
        }
		else{
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    void addAtPosition(String title, String director, int year, double rating, int position){
        if(position <= 0 || head == null){
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for(int i = 1; temp != null && i < position; i++){
            temp = temp.next;
        }
        if(temp == null){
            addAtEnd(title, director, year, rating);
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        if(temp.next != null){
            temp.next.prev = newMovie;
        }
        temp.next = newMovie;
        if(newMovie.next == null){
            tail = newMovie;
        }
    }

    void removeByTitle(String title){
        if(head == null){
			return;
		}
        if(head.title.equals(title)){
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }
        Movie temp = head;
        while(temp != null && !temp.title.equals(title)){
            temp = temp.next;
        }
        if(temp == null){
			return;
		}
        if(temp.next != null){
			temp.next.prev = temp.prev;
		}
        if(temp.prev != null){
			temp.prev.next = temp.next;
		}
        if(temp == tail){
			tail = temp.prev;
		}
    }

    void searchByDirector(String director){
        Movie temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.director.equalsIgnoreCase(director)){
                System.out.println("Title: " + temp.title + ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
			System.out.println("No movies found for director: " + director);
		}
    }

    void searchByRating(double rating){
        Movie temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.rating == rating){
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
			System.out.println("No movies found with rating: " + rating);
		}
    }

    void updateRating(String title, double newRating){
        Movie temp = head;
        while(temp != null){
            if(temp.title.equals(title)){
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward(){
        Movie temp = head;
        while(temp != null){
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse(){
        Movie temp = tail;
        while(temp != null){
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem{
    public static void main(String[] args){
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        
        list.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtBeginning("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        list.addAtPosition("Titanic", "James Cameron", 1997, 7.8, 2);
        
        System.out.println("Movie List (Forward):");
        list.displayForward();
        
        System.out.println("\nMovie List (Reverse):");
        list.displayReverse();
        
        System.out.println("\nSearching for movies by Christopher Nolan:");
        list.searchByDirector("Christopher Nolan");
        
        System.out.println("\nSearching for movies with rating 8.8:");
        list.searchByRating(8.8);
        
        list.updateRating("Inception", 9.0);
        
        System.out.println("\nUpdated Movie List:");
        list.displayForward();
        
        list.removeByTitle("Titanic");
        
        System.out.println("\nMovie List after removing 'Titanic':");
        list.displayForward();
    }
}
