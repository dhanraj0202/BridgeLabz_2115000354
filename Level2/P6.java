import java.util.Scanner;
public class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int i = 0;
		while(i<=num){
			if(i%3==0 && i%5!=0){
				System.out.println("Fizz");
			}
			else if(i%3!=0 && i%5==0){
				System.out.println("Buzz");
			}
			else if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else{
				System.out.println(i);
			}
			i++;
		}
	}
}