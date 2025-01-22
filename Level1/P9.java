import java.util.Scanner;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fee: ");
		double fee = sc.nextDouble();
		System.out.print("Enter discount: ");
		double discountPercent = sc.nextDouble();
		double discount = fee*discountPercent/100;
		double discountedFee = fee-discount;
		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}