import java.util.Scanner;
public class P7{
    public static int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println("Sum of " + n + " natural numbers: " + sum);
    }
}
