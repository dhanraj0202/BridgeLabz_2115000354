import java.util.Scanner;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int[] multiplicationResult = new int[4];
		for(int i = 0; i<multiplicationResult.length; i++){
			multiplicationResult[i] = num*(i+6);
			System.out.println(num + "*" + (i+6) + " = " + multiplicationResult[i]);
		}
	}
}