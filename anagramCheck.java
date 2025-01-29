import java.util.Scanner;
public class anagramCheck{
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
        return java.util.Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        if(areAnagrams(str1, str2)){
            System.out.println("The strings are anagrams.");
        }
		else{
            System.out.println("The strings are not anagrams.");
        }
    }
}
