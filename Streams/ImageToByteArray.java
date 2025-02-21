import java.io.*;
import java.nio.file.Files;

public class ImageToByteArray{
	public static void main(String[] args){
		String sourceImage = "source.jpeg";
		String destinationImage = "copy.jpeg";

		try{
			byte[] imageBytes = convertImageToByteArray(sourceImage);
			System.out.println("Image successfully converted to byte array.");

			writeByteArrayToImage(imageBytes, destinationImage);
			System.out.println("Byte array successfully written to new image file.");

			if(Files.mismatch(new File(sourceImage).toPath(), new File(destinationImage).toPath()) == -1){
				System.out.println("Verification Successful: The copied image is identical to the original.");
			}
			else{
				System.out.println("Verification Failed: The copied image differs from the original.");
			}

		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static byte[] convertImageToByteArray(String filePath) throws IOException{
		try(FileInputStream fis = new FileInputStream(filePath);
			ByteArrayOutputStream baos = new ByteArrayOutputStream()){

			byte[] buffer = new byte[4096];
			int bytesRead;

			while((bytesRead = fis.read(buffer)) != -1){
				baos.write(buffer, 0, bytesRead);
			}

			return baos.toByteArray();
		}
	}

	public static void writeByteArrayToImage(byte[] imageData, String filePath) throws IOException{
		try(ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
			FileOutputStream fos = new FileOutputStream(filePath)){

			byte[] buffer = new byte[4096];
			int bytesRead;

			while((bytesRead = bais.read(buffer)) != -1){
				fos.write(buffer, 0, bytesRead);
			}
		}
	}
}