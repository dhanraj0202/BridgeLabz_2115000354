import java.util.Scanner;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter physics number: ");
		int physics = sc.nextInt();
		System.out.print("Enter chemistry number: ");
		int chemistry = sc.nextInt();
		System.out.print("Enter maths number: ");
		int maths = sc.nextInt();
		float percentage = (physics+chemistry+maths)/3.0f;
		if(percentage<=39){
			System.out.print("R - Remedial standards");
		}
		else if(percentage>=40 && percentage<=49){
			System.out.print("E - Level 1-, too below agency-normalized standards");
		}
		else if(percentage>=50 && percentage<=59){
			System.out.print("D - Level 1, well below agency-normalized standards");
		}
		else if(percentage>=60 && percentage<=69){
			System.out.print("C - Level 2, below, but approaching agency-normalized standards");
		}
		else if(percentage>=70 && percentage<=79){
			System.out.print("B - Level 3, at agency-normalized standards");
		}
		else{
			System.out.print("A - Level 4, above agency-normalized standards");
		}
	}
}