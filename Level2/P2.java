import java.util.Scanner;
public class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		int x = a+b*c;
		int y = a*b+c;
		int z = a%b+c;
		System.out.print("The results of Int Operations are " + x + ", " + y + " and " + z );
	}
}