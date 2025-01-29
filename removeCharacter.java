public class removeCharacter{
	public static String removeChar(String str, char ch){
		return str.replaceAll(String.valueOf(ch), "");
	}
	public static void main(String[] args){
		String str = "Hello, World!";
		char ch = 'l';
		String result = removeChar(str, ch);
        System.out.println("Modified String: " + result);
	}
}