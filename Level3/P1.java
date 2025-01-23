import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, 3);
            originalNum /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
