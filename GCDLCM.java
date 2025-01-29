import java.util.Scanner;
public class GCDLCM{
    public static int getInput(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextInt();
    }
    public static int calculateGCD(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static int calculateLCM(int num1, int num2, int gcd){
        return (num1 * num2) / gcd;
    }
    public static void displayResults(int gcd, int lcm){
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
    public static void main(String[] args){
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        displayResults(gcd, lcm);
    }
}
