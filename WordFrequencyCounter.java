import java.io.*;
import java.util.*;

public class WordFrequencyCounter{
	public static void main(String[] args){
		String filePath = "input.txt";
		Map<String, Integer> wordFrequency = countWordFrequency(filePath);
		System.out.println(wordFrequency);
	}

	static Map<String, Integer> countWordFrequency(String filePath){
		Map<String, Integer> frequencyMap = new HashMap<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) != null){
				String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
				for(String word : words){
					if(!word.isEmpty()){
						frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
					}
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return frequencyMap;
	}
}