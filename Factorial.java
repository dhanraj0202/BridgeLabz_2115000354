import java.util.Scanner;
public class Factorial{
    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    public static int calculateFactorial(int num){
        if(num==0 || num==1){
            return 1;
        }
		else{
            return num * calculateFactorial(num - 1);
        }
    }
    public static void displayResult(int result){
        System.out.println("The factorial is: " + result);
    }
    public static void main(String[] args){
        int num = getInput();
        int result = calculateFactorial(num);
        displayResult(result);
    }
}
