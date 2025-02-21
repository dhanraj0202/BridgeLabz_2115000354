import java.io.*;

public class ReadInput{
	public static void main(String[] args){
		String fileName = "user_info.txt";

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter writer = new FileWriter(fileName, true)){

			System.out.print("Enter your name: ");
			String name = br.readLine();

			System.out.print("Enter your age: ");
			String age = br.readLine();

			System.out.print("Enter your favorite programming language: ");
			String language = br.readLine();

			writer.write("Name: " + name + "\n");
			writer.write("Age: " + age + "\n");
			writer.write("Favorite Programming Language: " + language + "\n");
			writer.write("-----------------------------\n");

			System.out.println("User information saved successfully!");

		}catch(IOException e){
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}