import java.util.Scanner;
public class PalindromeChecker{
	public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
	public static boolean isPalindrome(String str){
		char temp;
		String rev = "";
		for(int i = 0; i<str.length(); i++){
			temp = str.charAt(i);
			rev = temp + rev;
		}
		if(str.equals(rev)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
	public static void main(String[] args){
		String str = getInput();
		boolean result = isPalindrome(str);
		displayResult(result);
	}
}