public class palindromeString{
	public static void main(String[] args){
		String str = "naman";
		String rev = "";
		char temp;
		for(int i = 0; i<str.length(); i++){
			temp = str.charAt(i);
			rev = temp + rev;
		}
		if(str.equals(rev)){
			System.out.print("Yes, it is a palindrome string.");
		}
		else{
			System.out.print("No, it is not a palindrome string.");
		}
	}
}