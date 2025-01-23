import java.util.*;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0){
			sum = sum+num;
			System.out.println("Total value is " + sum);
			System.out.print("Enter next number: ");
			num = sc.nextInt();
		}
		System.out.print("Total value is " + sum);
	}
}