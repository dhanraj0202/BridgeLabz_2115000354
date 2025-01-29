public class compareString{
    public static String compareStrings(String str1, String str2){
        int len = Math.min(str1.length(), str2.length());
        for(int i = 0; i < len; i++){
            if(str1.charAt(i) < str2.charAt(i)){
                return str1 + " comes before " + str2;
            }
			else if(str1.charAt(i) > str2.charAt(i)){
                return str2 + " comes before " + str1;
            }
        }
        return str1.length() < str2.length() ? str1 + " comes before " + str2 : str2 + " comes before " + str1;
    }
    public static void main(String[] args){
        String str1 = "apple";
        String str2 = "banana";
        System.out.println(compareStrings(str1, str2));
    }
}
