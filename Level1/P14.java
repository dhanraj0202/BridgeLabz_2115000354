import java.util.Scanner;
public class P14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in feet: ");
		double feet = sc.nextDouble();
		double yard = feet/3;
		double mile = yard/1760;
		System.out.print("The distance given is " + yard + " in yards and " + mile + " in miles");
	}
}