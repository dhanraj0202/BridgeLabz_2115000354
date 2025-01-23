import java.util.*;
public class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the counter: ");
		int count = sc.nextInt();
		while(count!=1){
			System.out.println(count);
			count--;
		}
		System.out.print("Rocket Launch");
	}
}