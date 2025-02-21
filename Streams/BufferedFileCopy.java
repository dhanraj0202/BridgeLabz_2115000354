import java.io.*;

public class BufferedFileCopy{
	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args){
		String sourceFile = "source.txt";
		String destinationBuffered = "buffered_copy.txt";
		String destinationUnbuffered = "unbuffered_copy.txt";

		long bufferedTime = copyWithBufferedStreams(sourceFile, destinationBuffered);
		System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns");

		long unbufferedTime = copyWithUnbufferedStreams(sourceFile, destinationUnbuffered);
		System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns");

		System.out.println("\nBuffered Streams were " + (unbufferedTime / (double) bufferedTime) + " times faster!");
	}

	public static long copyWithBufferedStreams(String source, String destination){
		long startTime = System.nanoTime();

		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))){

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while((bytesRead = bis.read(buffer)) != -1){
				bos.write(buffer, 0, bytesRead);
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}

		return System.nanoTime() - startTime;
	}

	public static long copyWithUnbufferedStreams(String source, String destination){
		long startTime = System.nanoTime();

		try(FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(destination)){

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while((bytesRead = fis.read(buffer)) != -1){
				fos.write(buffer, 0, bytesRead);
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}

		return System.nanoTime() - startTime;
	}
}