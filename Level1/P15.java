import java.util.Scanner;
public class P15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter unit price: ");
		int unitPrice = sc.nextInt();
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		int total = unitPrice*quantity;
		System.out.print("The total purchase price is INR " + total + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
	}
}