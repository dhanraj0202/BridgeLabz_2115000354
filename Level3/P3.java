import java.util.Scanner;
public class P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;
        while (originalNum != 0) {
            sum += originalNum % 10;
            originalNum /= 10;
        }
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}
