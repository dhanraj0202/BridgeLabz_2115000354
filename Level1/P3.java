import java.util.Scanner;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("Is the first number the largest? Yes");
			System.out.println("Is the second number the largest? No");
			System.out.print("Is the third number the largest? No");
		}
		else{
			if(num2>num3){
				System.out.println("Is the first number the largest? No");
				System.out.println("Is the second number the largest? Yes");
				System.out.print("Is the third number the largest? No");
			}
			else{
				System.out.println("Is the first number the largest? No");
				System.out.println("Is the second number the largest? No");
				System.out.print("Is the third number the largest? Yes");
			}
		}
	}
}