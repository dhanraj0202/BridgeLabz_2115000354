public class mostFrequentCharacter{
    public static char findMostFrequentCharacter(String str){
        int[] freq = new int[256];
        for(int i = 0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        int maxFrequency = 0;
        char mostFrequentChar = str.charAt(0);
        for(int i = 0; i<str.length(); i++){
            if(freq[str.charAt(i)]>maxFrequency){
                maxFrequency = freq[str.charAt(i)];
                mostFrequentChar = str.charAt(i);
            }
        }
        return mostFrequentChar;
    }
    public static void main(String[] args){
        String str = "success";
        char result = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
