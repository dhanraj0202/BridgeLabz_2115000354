import java.util.Scanner;
public class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i<num.length; i++){
			System.out.print("Enter number" + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		for(int i = 0; i<num.length; i++){
			if(num[i]>0){
				if(num[i]%2==0){
					System.out.println(num[i] + " is even");
				}
				else{
					System.out.println(num[i] + " is odd");
				}
			}
			else if(num[i]==0){
				System.out.println("Zero");
			}
			else{
				System.out.println("Negative");
			}
		}
		if(num[0]>num[4]){
			System.out.println("First element is greater to last element");
		}
		else if(num[0]<num[4]){
			System.out.println("First element is smaller to last element");
		}
		else{
			System.out.println("First element is equal to last element");
		}
	}
}