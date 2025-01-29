import java.util.Scanner;
public class BasicCalculator{
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
    public static double getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static void displayResult(String operation, double result){
        System.out.println("Result of " + operation + ": " + result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        double result = 0;
        switch(choice){
            case 1:
                result = add(num1, num2);
                displayResult("Addition", result);
                break;
            case 2:
                result = subtract(num1, num2);
                displayResult("Subtraction", result);
                break;
            case 3:
                result = multiply(num1, num2);
                displayResult("Multiplication", result);
                break;
            case 4:
                result = divide(num1, num2);
                if(!Double.isNaN(result)){
                    displayResult("Division", result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }
}
