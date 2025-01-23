import java.util.Scanner;
public class P12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
		System.out.print("The multiples of " + num + " are ");
        for (int i = 100; i >= 1; i--) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }
}
