import java.util.Scanner;
public class P16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		int handshakes = (n*(n-1))/2;
		System.out.print("The total number of possible handshakes for " + n + " students is " + handshakes );
	}
}