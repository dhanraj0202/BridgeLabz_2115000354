import java.util.Scanner;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		float radius = sc.nextFloat();
		double area = 3.14*radius*radius;
		System.out.print("The area of the circle is " + area);
	}
}