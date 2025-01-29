import java.util.Random;
import java.util.Scanner;
public class NumberGuess{
    public static int generateGuess(int low, int high){
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
    public static String getFeedback(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess high, low, or correct? ");
        return scanner.nextLine().toLowerCase();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        String feedback;
        int guess;
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        do{
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            feedback = getFeedback();
            if(feedback.equals("high")){
                high = guess - 1;
            }
			else if(feedback.equals("low")){
                low = guess + 1;
            }
        } while(!feedback.equals("correct"));
        System.out.println("I guessed it! The number is " + guess);
    }
}
