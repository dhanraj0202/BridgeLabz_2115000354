import java.util.Scanner;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int n = sc.nextInt();
		System.out.print("Enter number of children: ");
		int m = sc.nextInt();
		int each = n/m;
		int rem = n%m;
		System.out.print("The number of chocolates each child gets is " + each + " and the number of remaining chocolates are " + rem);
	}
}