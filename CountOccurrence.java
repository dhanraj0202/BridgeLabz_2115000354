import java.io.*;

public class CountOccurrence{
	public static void main(String[] args){
		String filePath = "sample.txt";
		String target = "is";
		int count = 0;
		
		try(FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr)){
			
			String line;
			while((line = br.readLine()) != null){
				String[] words = line.split(" ");
				for(String word : words){
					if(word.equalsIgnoreCase(target)){
						count++;
					}
				}
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("The word \"" + target + "\" appears " + count + " times in the file.");
	}
}
