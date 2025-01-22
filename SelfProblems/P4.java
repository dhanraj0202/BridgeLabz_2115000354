import java.util.Scanner;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float first = sc.nextFloat();
		System.out.print("Enter second number: ");
		float second = sc.nextFloat();
		System.out.print("Enter third number: ");
		float third = sc.nextFloat();
		float average = (first+second+third)/3;
		System.out.print("The average of these three numbers is " + average);
	}
}