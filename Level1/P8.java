import java.util.Scanner;
public class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int[] factors = new int[(num/2)+1];
		int index = 0;
		for(int i = 1; i<=num; i++){
			if(num%i==0){
				factors[index] = i;
				index++;
			}
		}
		System.out.print("The factors of " + num + " are: ");
		for(int i = 0; i<index; i++){
			System.out.print(factors[i] + " ");
		}
	}
}