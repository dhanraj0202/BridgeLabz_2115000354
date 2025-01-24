import java.util.Scanner;
public class P7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i<number; i++){
            System.out.println("Enter details for person " + (i + 1) + ":");
            do{
                System.out.print("Weight (in kg, positive value): ");
                personData[i][0] = sc.nextDouble();
            }while(personData[i][0]<=0);
            do{
                System.out.print("Height (in meters, positive value): ");
                personData[i][1] = sc.nextDouble();
            } while(personData[i][1]<=0);
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if(personData[i][2]<18.5){
                weightStatus[i] = "Underweight";
            }
			else if(personData[i][2]>=18.5 && personData[i][2]<24.9){
                weightStatus[i] = "Normal weight";
            }
			else if(personData[i][2]>=25 && personData[i][2]<39.9){
                weightStatus[i] = "Overweight";
            }
			else{
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nDetails of each person:");
        for(int i = 0; i<number; i++){
            System.out.println("Heigth: " + personData[i][1] + "meters, Weigth: " + personData[i][0] + "kg, BMI: " +  personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
