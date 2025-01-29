public class substringOccurrences{
    public static int countOccurrences(String str, String sub){
        int count = 0, index = 0;
        while((index = str.indexOf(sub, index)) != -1){
            count++;
            index += sub.length();
        }
        return count;
    }
    public static void main(String[] args){
        String str = "banana ban bananana";
        String sub = "ban";
        System.out.println(countOccurrences(str, sub));
    }
}
