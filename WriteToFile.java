import java.io.*;

public class WriteToFile{
	public static void main(String[] args){
		String filePath = "sample.txt"; 

		try(InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw)){

			System.out.println("Enter text to write to the file (type 'exit' to stop):");

			String input;
			while(!(input = br.readLine()).equalsIgnoreCase("exit")){
				bw.write(input);
				bw.newLine(); 
			}

			System.out.println("User input has been written to " + filePath);

		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
