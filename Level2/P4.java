import java.util.Scanner;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
		float celsius = sc.nextFloat();
		float fahrenheit = ((celsius*9)/5+32);
		System.out.print("The " + celcius + " celcius is " + fahrenheit + " fahrenheit");
	}
}