import java.util.Scanner;
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.print("The Quotient is " + num1/num2 + " and Remainder is " + num1%num2 + " of two numbers " + num1 + " and " + num2 );
	}
}