import java.io.*;

public class ByteToCharStream{
	public static void main(String[] args){
		String filePath = "sample.txt"; 

		try(FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr)){

			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}

		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
