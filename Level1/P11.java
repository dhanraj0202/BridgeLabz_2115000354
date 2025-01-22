import java.util.Scanner;
public class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		double add = num1+num2;
		double sub = num1-num2;
		double mul = num1*num2;
		double div = num1/num2;
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + " and " + div);
	}
}