import java.util.Scanner;
public class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter Bonus: ");
		int bonus = sc.nextInt();
		int total = salary+bonus;
		System.out.print("The Salary is INR  " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + total);
	}
}