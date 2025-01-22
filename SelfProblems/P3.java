import java.lang.Math;
import java.util.Scanner;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent number: ");
		int exponent = sc.nextInt();
		System.out.print(base + " raised to " + exponent + " is " + Math.pow(base, exponent));
	}
}