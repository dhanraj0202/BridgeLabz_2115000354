import java.util.Scanner;
public class P9{
    public static boolean isPositive(int number){
        return number >= 0;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static int compare(int num1, int num2){
        return Integer.compare(num1, num2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int number : numbers){
            if(isPositive(number)){
                System.out.println(number + " is positive and " + (isEven(number) ? "even." : "odd."));
            }
			else{
                System.out.println(number + " is negative.");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        if (result == 0) System.out.println("First and last elements are equal.");
        else if (result > 0) System.out.println("First element is greater than the last.");
        else System.out.println("First element is less than the last.");
    }
}
