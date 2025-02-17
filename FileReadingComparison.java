import java.io.*;

public class FileReadingComparison{

	public static long readUsingFileReader(String filePath) throws IOException{
		long startTime = System.nanoTime();
		try(FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr)){
			while(br.read() != -1);
		}
		return (System.nanoTime()-startTime)/1000000;
	}

	public static long readUsingInputStreamReader(String filePath) throws IOException{
		long startTime = System.nanoTime();
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
			BufferedReader br = new BufferedReader(isr)){
			while(br.read() != -1);
		}
		return (System.nanoTime()-startTime)/1000000;
	}

	public static void main(String[] args){
		String filePath = "largefile.txt";

		try{
			System.out.println("Testing File Reading Performance...");
			long timeFileReader = readUsingFileReader(filePath);
			System.out.println("FileReader Time: " + timeFileReader + " ms");

			long timeInputStreamReader = readUsingInputStreamReader(filePath);
			System.out.println("InputStreamReader Time: " + timeInputStreamReader + " ms");

		}catch(IOException e){
			System.err.println("Error reading file: " + e.getMessage());
		}
	}
}
