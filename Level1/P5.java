import java.util.Scanner;
public class P5{
	public int posNegZero(int n){
		if(n==0)
			return 0;
		else if(n>1)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		P5 p5 = new P5();
		int result = p5.posNegZero(number);
		System.out.print("The result is " + result);
	}
}