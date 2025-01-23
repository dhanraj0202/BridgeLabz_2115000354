import java.util.Scanner;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.print("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.print("The person's age is " + age + " and cannot vote.");
		}
	}
}