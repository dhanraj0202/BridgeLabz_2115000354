import java.util.Scanner;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		int max = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.print("The maximum handshakes for " + numberOfStudents + " students are " + max);
	}
}