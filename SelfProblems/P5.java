import java.util.Scanner;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		float kilometers = sc.nextFloat();
		double miles = kilometers*0.621371;
		System.out.print("The distance in miles is " + miles);
	}
}