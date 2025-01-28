import java.util.Scanner;
public class P6{
	public boolean springSeason(int date, String month){
		if((date>=20 && month.equals("march")) || (month.equals("april")) || (month.equals("may")) || (date<=20 && month.equals("june")))
			return true;
		
		else
			return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = sc.nextLine();
		System.out.print("Enter the date: ");
		int date = sc.nextInt();
		P6 p6 = new P6();
		boolean spring = p6.springSeason(date, month);
		System.out.print(spring);
	}
}