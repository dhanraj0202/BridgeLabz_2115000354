import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int digitCount = 0;
        while(temp!=0){
            digitCount++;
            temp /= 10;
        }
        int[] digits = new int[digitCount];
        int index = 0;
        while(number!=0){
            digits[index++] = number % 10;
            number /= 10;
        }
        for(int i = 0; i<digitCount; i++){
            System.out.print(digits[i]);
        }
    }
}
