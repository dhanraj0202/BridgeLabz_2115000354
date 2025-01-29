import java.util.Scanner;
public class MaxOfThree{
    public static int getInput(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextInt();
    }
    public static int findMaximum(int num1, int num2, int num3){
		if(num1>num2 && num1>num3) return num1;
		else if(num2>num3) return num2;
		else return num3;
    }
    public static void main(String[] args){
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }
}
