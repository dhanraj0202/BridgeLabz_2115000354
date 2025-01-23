import java.util.Scanner;
public class P17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter year of service: ");
		int service = sc.nextInt();
		int bonus = 0;
		if(service>5){
			bonus = salary/20;
			System.out.println("Bonus amount is " + bonus);
		}
		else{
			System.out.println("Bonus amount is " + bonus);
		}
	}
}