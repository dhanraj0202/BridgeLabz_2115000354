import java.util.Scanner;
public class P6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if(bmi[i]<18.5) {
                status[i] = "Underweight";
            }
			else if(bmi[i]>=18.5 && bmi[i]<24.9) {
                status[i] = "Normal";
            }
			else if(bmi[i]>=25 && bmi[i] < 39.9) {
                status[i] = "Overweight";
            }
			else{
                status[i] = "Obese";
            }
        }
        System.out.println("\nDetails of each person:");
        for (int i = 0; i < n; i++){
            System.out.println("Person " + (i+1) + ": " + heights[i] + "meters, " + weights[i]+ "kg, " + bmi[i]+ "bmi, " + status[i]);
        }
    }
}
