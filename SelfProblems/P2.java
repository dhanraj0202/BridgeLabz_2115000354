import java.util.Scanner;
public class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		float length = sc.nextFloat();
		System.out.print("Enter the width of the rectangle: ");
		float width = sc.nextFloat();
		double perimeter = 2*(length+width);
		System.out.print("The perimeter of the rectangle is " + perimeter);
	}
}