import java.util.Scanner;
public class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double heightSum = 0;
		double mean;
		for(int i = 0; i<heights.length; i++){
			System.out.print("Enter height of player " + (i+1) + ": ");
			heights[i] = sc.nextDouble();
		}
		for(int i = 0; i<heights.length; i++){
			heightSum = heightSum + heights[i];
		}
		mean = heightSum/heights.length;
		System.out.print("The mean height of the football team is " + mean);
	}
}