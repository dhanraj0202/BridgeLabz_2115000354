import java.util.*;
public class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = sc.nextLine();
		System.out.print("Enter the day: ");
		int day = sc.nextInt();
		if(month.equalsIgnoreCase("march") && day>=20){
			System.out.print("Its a Spring Season");
		}
		else if(month.equalsIgnoreCase("april") && day>=1){
			System.out.print("Its a Spring Season");
		}
		else if(month.equalsIgnoreCase("may") && day>=1){
			System.out.print("Its a Spring Season");
		}
		else if(month.equalsIgnoreCase("june") && day<=20){
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
	}
}