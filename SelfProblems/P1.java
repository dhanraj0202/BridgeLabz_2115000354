import java.util.Scanner;
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		float principal = sc.nextFloat();
		System.out.print("Enter the rate of interest: ");
		float rate = sc.nextFloat();
		System.out.print("Enter the time period: ");
		float time = sc.nextFloat();
		double SI = (principal*rate*time)/100;
		System.out.print("The simple interest is " + SI);
	}
}