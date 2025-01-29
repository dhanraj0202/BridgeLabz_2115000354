public class replaceWord{
    public static String replaceWord(String sentence, String oldWord, String newWord){
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
    public static void main(String[] args){
        String sentence = "Hello world, welcome to the world!";
        String oldWord = "world";
        String newWord = "universe";
        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
