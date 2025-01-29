public class removeDuplicates{
    public static String removeDuplicates(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String input = "Hello, World!";
        System.out.println(removeDuplicates(input));
    }
}
