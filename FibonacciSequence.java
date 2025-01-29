import java.util.Scanner;
public class FibonacciSequence{
    public static void generateFibonacci(int terms){
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Sequence: ");
        for(int i = 1; i <= terms; i++){
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
    }
}
