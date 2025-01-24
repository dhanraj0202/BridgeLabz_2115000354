import java.util.Scanner;
public class P8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        for(int i = 0; i<numStudents; i++){
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            do{
				System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
            }while(marks[i][0]<0);

            do{
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
            }while(marks[i][1]<0);

            do{
                System.out.print("Maths: ");
                marks[i][2] = sc.nextInt();
            }while(marks[i][2]<0);
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;
            if(percentages[i]>=80){
                grades[i] = 'A';
            }
			else if(percentages[i]>=70){
                grades[i] = 'B';
            }
			else if(percentages[i]>=60){
                grades[i] = 'C';
            }
			else if(percentages[i]>=50){
                grades[i] = 'D';
            }
			else if(percentages[i]>=40){
                grades[i] = 'E';
            }
			else{
                grades[i] = 'R';
            }
        }
        System.out.println("\nStudent Details:");
        for(int i = 0; i<numStudents; i++){
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " Total: " + totalMarks + " Percentage: " + percentages[i] + " Grade: " + grades[i]);
        }
    }
}
