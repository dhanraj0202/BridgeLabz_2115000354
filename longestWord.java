public class longestWord{
    public static String findLongestWord(String sentence){
        String[] words = sentence.split(" ");
        String longest = "";
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }
    public static void main(String[] args){
        String sentence = "Hello, my name is Dhanraj.";
        System.out.println(findLongestWord(sentence));
    }
}
