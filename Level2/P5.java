import java.util.Scanner;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		float fahrenheit = sc.nextFloat();
		float celsius = (fahrenheit-32)*5/9;
		System.out.print("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
	}
}