import java.util.*;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the counter: ");
		int count = sc.nextInt();
		for(int i = count; count>1; count--){
			System.out.println(count);
		}
		System.out.print("Rocket Launch");
	}
}