import java.util.Scanner;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height in cm: ");
		double height = sc.nextDouble();
		double inches = height/2.54;
		double feet = inches/12;
		System.out.print("Your height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
	}
}