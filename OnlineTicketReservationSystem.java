import java.util.*;

class Ticket{
    int ticketID;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime){
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem{
    Ticket head = null, tail = null;
    int ticketCount = 0;

    void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime){
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if(head == null){
            head = newTicket;
            newTicket.next = head;
        }
		else{
            tail.next = newTicket;
            newTicket.next = head;
        }
        tail = newTicket;
        ticketCount++;
    }

    void removeTicket(int ticketID){
        if(head == null){
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head, prev = tail;
        do{
            if(current.ticketID == ticketID){
                if(current == head && ticketCount == 1){
                    head = null;
                    tail = null;
                }
				else{
                    prev.next = current.next;
                    if(current == head){
						head = current.next;
					}
                    if(current == tail){
						tail = prev;
					}
                }
                ticketCount--;
                System.out.println("Ticket " + ticketID + " removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        }while(current != head);

        System.out.println("Ticket " + ticketID + " not found.");
    }

    void displayTickets(){
        if(head == null){
            System.out.println("No booked tickets.");
            return;
        }

        Ticket temp = head;
        System.out.println("Booked Tickets:");
        do{
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        }while(temp != head);
    }

    void searchTicket(String searchTerm){
        if(head == null){
            System.out.println("No booked tickets.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do{
            if(temp.customerName.equalsIgnoreCase(searchTerm) || temp.movieName.equalsIgnoreCase(searchTerm)){
                System.out.println("Found Ticket - ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        }while(temp != head);

        if(!found){
			System.out.println("No ticket found for " + searchTerm);
		}
    }

    void getTotalTickets(){
        System.out.println("Total Booked Tickets: " + ticketCount);
    }
}

public class OnlineTicketReservationSystem{
    public static void main(String[] args){
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Dhanraj", "Deva", "A12", "7:00 PM");
        system.addTicket(102, "Nikhil", "Iron Man", "B5", "8:00 PM");
        system.addTicket(103, "Aryan", "Inception", "C3", "6:30 PM");

        system.displayTickets();
        system.getTotalTickets();

        system.searchTicket("Dhanraj");
        system.searchTicket("Inception");

        system.removeTicket(102);
        system.displayTickets();
        system.getTotalTickets();
    }
}
