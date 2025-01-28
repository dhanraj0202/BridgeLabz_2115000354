import java.util.Scanner;
public class P1{
	public int simpleInterest(int principal, int rate, int time){
		return (int) principal*rate*time/100;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		int principal = sc.nextInt();
		System.out.print("Enter the rate: ");
		int rate = sc.nextInt();
		System.out.print("Enter the time: ");
		int time = sc.nextInt();
		P1 p1 = new P1();
		int SI = p1.simpleInterest(principal,rate,time);
		System.out.print("The Simple Interest is " + SI + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}