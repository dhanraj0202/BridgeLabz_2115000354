import java.util.Scanner;
public class P8{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter initial city: ");
		String fromCity = sc.nextLine();
		System.out.print("Enter mid city: ");
		String viaCity = sc.nextLine();
		System.out.print("Enter final city: ");
		String toCity =	sc.nextLine();
		System.out.print("Enter distance between initial and mid city: ");
		double distanceFromToVia = sc.nextInt();
		System.out.print("Enter time taken between initial and mid city in minutes: ");
		int timeFromToVia = sc.nextInt();
		System.out.print("Enter distance between mid and final city: ");
		double distanceViaToFinalCity = sc.nextInt();
		System.out.print("Enter time taken between mid and final city in minutes: ");
		int timeViaToFinalCity = sc.nextInt();
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		int totalTimeHours = (timeFromToVia + timeViaToFinalCity)/60;
		int totalTimeMinutes = (timeFromToVia + timeViaToFinalCity)%60;
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTimeHours + " hours and " + totalTimeMinutes + " minutes");
	}
}
