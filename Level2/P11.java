import java.util.Scanner;
public class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int greatestFactor = 1;
		System.out.print("The factors of " + num + " are ");
		for(int i = 1; i<=num; i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
		
	}
}