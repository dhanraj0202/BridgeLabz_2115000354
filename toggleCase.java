public class toggleCase{
    public static String toggleCase(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                result += (char) (ch + 32);
            }
			else if(ch >= 'a' && ch <= 'z'){
                result += (char) (ch - 32);
            }
			else{
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String input = "Hello World!";
        System.out.println(toggleCase(input));
    }
}
