import java.util.Scanner;
public class P12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base in cm: ");
		double base = sc.nextDouble();
		System.out.print("Enter height in cm: ");
		double height = sc.nextDouble();
		double areaCm = 0.5*base*height;
		double areaInches = areaCm/(2.54*2.54);
		System.out.print("The area of the triangle in square centimeters is " + areaCm + " and square inches is " + areaInches );
	}
}