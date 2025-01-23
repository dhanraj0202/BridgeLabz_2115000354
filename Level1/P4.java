import java.util.Scanner;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		if(num>0){
			while(temp>0){
				sum = sum+temp;
				temp--;
			}
			System.out.print("The sum of " + num + " natural numbers is " + sum);
		}
		else{
			System.out.print("The number " + num + " is not a natural number");
		}
	}
}