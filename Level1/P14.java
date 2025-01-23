import java.util.*;
public class P14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int fact = 1;
		while(temp!=1){
			fact = fact*temp;
			temp--;
		}
		System.out.print("The factorial of " + num + " is " + fact);
	}
}