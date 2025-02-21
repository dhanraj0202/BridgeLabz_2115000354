import java.io.*;

public class TryWithResources{
	public static void main(String[] args){
		String filePath = "source.txt";

		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String firstLine = reader.readLine();
			if(firstLine != null){
				System.out.println(firstLine);
			}
		}catch(IOException e){
			System.out.println("Error reading file");
		}
	}
}