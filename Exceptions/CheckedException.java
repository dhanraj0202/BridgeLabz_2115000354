import java.io.*;

public class CheckedException{
	public static void main(String[] args){
		String filePath = "source.txt";

		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("File not found");
		}
	}
}