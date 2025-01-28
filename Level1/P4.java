import java.util.Scanner;
public class P4{
	public int numOfRounds(int side1, int side2, int side3){
		int perimeter = side1+side2+side3;
		return (int) 5000/perimeter;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first side: ");
		int side1 = sc.nextInt();
		System.out.print("Enter second side: ");
		int side2 = sc.nextInt();
		System.out.print("Enter third side: ");
		int side3 = sc.nextInt();
		P4 p4 = new P4();
		int rounds = p4.numOfRounds(side1,side2,side3);
		System.out.print("The athlete must complete " + rounds + " round");
	}
}