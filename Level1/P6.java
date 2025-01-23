import java.util.Scanner;
public class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num>0){
			System.out.print("The number " + num + " is positive.");
		}
		else if(num==0){
			System.out.print("The number " + num + " is zero.");
		}
		else{
			System.out.print("The number " + num + " is negative.");
		}
	}
}