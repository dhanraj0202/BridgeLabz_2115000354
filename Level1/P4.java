import java.util.Scanner;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] num = new double[10];
		double total = 0;
		for(int i = 0; i<num.length; i++){
			System.out.print("Enter number" + (i+1) + ": ");
			num[i] = sc.nextDouble();
			if(num[i]<1){
				break;
			}
		}
		System.out.print("The numbers are ");
		for(int i = 0; i<num.length; i++){
			if(num[i]>0){
				System.out.println(num[i]);
				total = total+num[i];
			}
		}
		System.out.print("Total sum is " + total);
	}
}
