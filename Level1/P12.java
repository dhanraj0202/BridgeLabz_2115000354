import java.util.Scanner;
public class P12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int sumWhile = 0;
		if(num>0){
			sum = (temp*(temp+1))/2;
			while(temp>0){
				sumWhile = sumWhile+temp;
				temp--;
			}
			System.out.println("The sum of " + num + " natural numbers using while loop is " + sumWhile);
			System.out.println("And the sum using direct formula is " + sum);
			if(sum==sumWhile){
				System.out.print("Both sum are same.");
			}
			else{
				System.out.print("Both sum are not same.");
			}
		}
		else{
			System.out.print("The number " + num + " is not a natural number");
		}
	}
}