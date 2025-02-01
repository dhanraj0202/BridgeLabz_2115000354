public class HotelBooking{
	private String guestName;
	private String roomType;
	private int nights;
	
	HotelBooking(){
		guestName = "Dhanraj";
		roomType = "VIP";
		nights = 4;
	}
	
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking prevBooking){
		this.guestName = prevBooking.guestName;
		this.roomType = prevBooking.roomType;
		this.nights = prevBooking.nights;
	}
	
	void displayBookingDetails(){
		System.out.println("Guest Name: " + guestName);
		System.out.println("Room Type: " + roomType);
		System.out.println("Nights: " + nights);
	}
	
	public static void main(String[] args){
		HotelBooking booking1 = new HotelBooking();
		booking1.displayBookingDetails();
		HotelBooking booking2 = new HotelBooking("Rahul", "Non-VIP", 3);
		booking2.displayBookingDetails();
		HotelBooking booking3 = new HotelBooking(booking2);
		booking3.displayBookingDetails();
	}
}