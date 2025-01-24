import java.util.Scanner;
public class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num>0){
			int size = num/2+1;
			int[] even = new int[size];
			int[] odd = new int[size];
			int evenIndex = 0;
			int oddIndex = 0;
			for(int i = 1; i<num+1; i++){
				if(i%2==0)
					even[evenIndex++] = i;
				else
					odd[oddIndex++] = i;
			}
			System.out.print("Even numbers: ");
			for (int i = 0; i < evenIndex; i++) {
				System.out.print(even[i] + " ");
			}
			System.out.print("\nOdd numbers: ");
			for (int i = 0; i < oddIndex; i++) {
				System.out.print(odd[i] + " ");
			}
		}
		else{
			System.out.println(num + " is not a natural number.");
		}
		
	}
}