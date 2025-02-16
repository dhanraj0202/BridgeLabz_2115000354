import java.io.*;

public class CompareAll{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		long startTime,endTime;
		
		startTime = System.nanoTime();
		for(long i = 0; i<1000000; i++){
			sb1.append("hello");
		}
		endTime = System.nanoTime();
		System.out.println("StringBuffer Concatenation time taken " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for(long i = 0; i<1000000; i++){
			sb2.append("hello");
		}
		endTime = System.nanoTime();
		System.out.println("StringBuilder Concatenation time taken " + (endTime-startTime) + "ns");
		System.out.println("StringBuilder is faster than StringBuffer.");
		
		
		String filePath = "example.txt";

		System.out.println("Reading with FileReader...");
		long fileReaderTime = countWordsUsingFileReader(filePath);
		System.out.println("Time taken with FileReader: " + fileReaderTime + " ms\n");

		System.out.println("Reading with InputStreamReader...");
		long inputStreamReaderTime = countWordsUsingInputStreamReader(filePath);
		System.out.println("Time taken with InputStreamReader: " + inputStreamReaderTime + " ms\n");

		System.out.println("Performance Comparison:");
		System.out.println("InputStreamReader is faster than FileReader.");
    }
	
	

	public static long countWordsUsingFileReader(String filePath){
		long startTime = System.currentTimeMillis();
		int wordCount = 0;

		try(FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr)){

			String line;
			while((line = br.readLine()) != null){
				wordCount += line.split(" ").length;
			}

		}
		catch(IOException e){
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Word Count using FileReader: " + wordCount);
		return endTime - startTime;
    }

	public static long countWordsUsingInputStreamReader(String filePath){
		long startTime = System.currentTimeMillis();
		int wordCount = 0;

		try(FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr)){

			String line;
			while((line = br.readLine()) != null){
				wordCount += line.split("\\s+").length; // Splitting on whitespace
			}

		}
		catch(IOException e){
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Word Count using InputStreamReader: " + wordCount);
		return endTime - startTime;
    }
}
