import java.util.Scanner;
public class P13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int sumFor = 0;
		if(num>0){
			sum = (temp*(temp+1))/2;
			for(int i = temp; i>0; i-- ){
				sumFor = sumFor+i;
			}
			System.out.println("The sum of first " + num + " natural numbers using for loop is " + sumFor);
			System.out.println("And the sum using direct formula is " + sum);
			if(sum==sumFor){
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