import java.util.Scanner;
public class P16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int i = 1; i<num+1; i++){
			if(i%2==0){
				System.out.println(i + " is an even number");
			}
			else{
				System.out.println(i + " is a odd number");
			}
		}
	}
}