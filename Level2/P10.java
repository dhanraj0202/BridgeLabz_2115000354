import java.util.Scanner;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.print("Enter the power: ");
		int power = sc.nextInt();
		int result = 1;
		for(int i = power; i>0; i--){
			result = result*num;
		}
		System.out.print("The result is " + result);
	}
}