import java.util.*;
public class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(true){
			if(num<0){
				break;
			}
			sum = sum+num;
			System.out.println("Total value is " + sum);
			System.out.print("Enter next number: ");
			num = sc.nextInt();
		}
		System.out.print("Total value is " + sum);
	}
}