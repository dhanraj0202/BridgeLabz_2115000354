public class SearchSpecific{
    public static String findSentenceWithWord(String[] sentences, String word){
        for(String sentence : sentences){
            if(sentence.toLowerCase().contains(word.toLowerCase())){
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args){
        String[] sentences ={
            "Hello World",
            "My name is Dhanraj.",
            "Java is a programming language."
        };

        String word = "java";

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }
}
