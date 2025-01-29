public class countVowelsConsonants{
	public static void main(String[] args){
		String str = "Hello World!";
		str = str.toLowerCase();
		int countVowels = 0;
		int countConsonants = 0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
				countVowels++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				countConsonants++;
			}
		}
		System.out.println("No. of vowels in the given String are " + countVowels);
		System.out.print("No. of consonants in the given String are " + countConsonants);
	}
}