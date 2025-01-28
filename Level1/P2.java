import java.util.Scanner;
public class P2{
	public int maxHandshakes(int n){
		return (int) (n*(n-1))/2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		P2 p2 = new P2();
		int max = p2.maxHandshakes(numberOfStudents);
		System.out.print("The maximum handshakes for " + numberOfStudents + " students are " + max);
	}
}