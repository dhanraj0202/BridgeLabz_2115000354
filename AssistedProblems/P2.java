import java.util.Scanner;
public class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = sc.nextInt();
		System.out.print("Enter second number: ");
		int second = sc.nextInt();
		int result =  first+second;
		System.out.print("Sum of a and b is " + result);
	}
}