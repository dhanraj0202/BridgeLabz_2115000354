import java.util.Scanner;
public class TemperatureConverter{
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static void displayResult(String scale, double value){
        System.out.println("The temperature in " + scale + " is: " + value);
    }
    public static void main(String[] args){
        int choice;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();
        if(choice==1){
            double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult("Celsius", celsius);
        }
		else if(choice==2){
            double celsius = getInput("Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult("Fahrenheit", fahrenheit);
        }
		else{
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
