import java.util.Scanner;
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
		double[] yearsOfService = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;
		for(int i = 0; i<10; i++){
			System.out.println("Enter details for employee " + (i + 1) + ":");
			while(true){
				System.out.print("Salary: ");
				double inputSalary = sc.nextDouble();
				if(inputSalary > 0){
					salary[i] = inputSalary;
					break;
				}
				else{
					System.out.println("Invalid salary. Please enter a positive number.");
				}
			}
			while(true){
				System.out.print("Years of Service: ");
				double inputYears = sc.nextDouble();
				if(inputYears >= 0){
					yearsOfService[i] = inputYears;
					break;
				}
				else{
					System.out.println("Invalid years of service. Please enter a non-negative number.");
				}
			}
		}
		for(int i = 0; i<10; i++){
			if(yearsOfService[i] > 5){
				bonus[i] = salary[i] * 0.05;
			}
			else{
				bonus[i] = salary[i] * 0.02;
			}
			newSalary[i] = salary[i] + bonus[i];
			totalBonus += bonus[i];
			totalOldSalary += salary[i];
			totalNewSalary += newSalary[i];
		}
		System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
		System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
		System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
	}
}
