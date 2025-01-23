import java.util.*;
public class P15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int fact = 1;
		for(int i = temp; i>1; i--){
			fact = fact*i;
		}
		System.out.print("The factorial of " + num + " is " + fact);
	}
}