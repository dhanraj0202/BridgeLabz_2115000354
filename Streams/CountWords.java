import java.io.*;
import java.util.*;

public class CountWords{
	public static void main(String[] args){
		String filePath = "source.txt";

		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			Map<String, Integer> wordCountMap = new HashMap<>();
			String line;

			while((line = reader.readLine()) != null){
				line = line.toLowerCase().replaceAll("[^a-zA-Z ]", ""); 
				String[] words = line.split("\\s+");

				for(String word : words){
					if(!word.isEmpty()){
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}

			List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
			sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

			System.out.println("Top 5 most frequent words:");
			int count = 0;
			for(Map.Entry<String, Integer> entry : sortedWords){
				System.out.println(entry.getKey() + " -> " + entry.getValue());
				if(++count == 5){
					break;
				}
			}

		}catch(IOException e){
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}