import java.util.Scanner;
public class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight: ");
		double weight = sc.nextDouble();
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		double heightM = height/100;
		double BMI = weight/(heightM*heightM);
		if(BMI<=18.4){
			System.out.print("Underweight");
		}
		else if(BMI>18.4 && BMI<25.0){
			System.out.print("Normal");
		}
		else if(BMI>=25.0 && BMI<40.0){
			System.out.print("Overweight");
		}
		else{
			System.out.print("Obese");
		}
	}
}