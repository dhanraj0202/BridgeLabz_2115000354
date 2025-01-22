import java.util.Scanner;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side: ");
		int side1 = sc.nextInt();
		System.out.print("Enter second side: ");
		int side2 = sc.nextInt();
		System.out.print("Enter third side: ");
		int side3 = sc.nextInt();
		int perimeter = side1+side2+side3;
		double rounds = 5000.0/perimeter;
		System.out.print("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
	}
}