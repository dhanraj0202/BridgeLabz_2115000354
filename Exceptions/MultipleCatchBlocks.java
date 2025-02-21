import java.util.Scanner;

public class MultipleCatchBlocks{
	public static void main(String[] args){
		Integer[] numbers = {10, 20, 30, 40, 50};
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.print("Enter index: ");
			int index = scanner.nextInt();
			System.out.println("Value at index " + index + ": " + numbers[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index!");
		}catch(NullPointerException e){
			System.out.println("Array is not initialized!");
		}catch(Exception e){
			System.out.println("Invalid input. Please enter a valid number.");
		}finally{
			scanner.close();
		}
	}
}