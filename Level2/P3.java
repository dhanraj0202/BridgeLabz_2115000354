import java.util.Scanner;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("Enter third number: ");
		double c = sc.nextDouble();
		double x = a+b*c;
		double y = a*b+c;
		double z = a%b+c;
		System.out.print("The results of Double Operations are " + x + ", " + y + " and " + z );
	}
}