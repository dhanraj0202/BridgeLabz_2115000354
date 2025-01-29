public class reverseString{
	public static void main(String[] args){
		String str = "Hello World!";
		String rev = "";
		char temp;
		for(int i = 0; i<str.length(); i++){
			temp = str.charAt(i);
			rev = temp + rev;
		}
		System.out.print("The reverse of the string " + str + " is " + rev);
	}
}