import java.util.Scanner;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: ");
		float radius = sc.nextFloat();
		System.out.print("Enter the height of the cylinder: ");
		float height = sc.nextFloat();
		double volume = 3.14*radius*radius*height;
		System.out.print("The volume of the cylinder is " + volume);
	}
}