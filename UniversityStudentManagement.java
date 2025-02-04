class Student{
	static String universityName = "GLA";
	private String name;
	final int rollNumber;
	private String grade;
	static int totalStudents;	
	static void displayTotalStudents(){
		System.out.println("Total Students: " + totalStudents);
	}
	
	Student(String name, int rollNumber, String grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}
	
	void displayStudentDetails(){
		if(this instanceof Student){
			System.out.println("University Name: " + this.universityName);
			System.out.println("Name: " + this.name);
			System.out.println("Roll Number: " + this.rollNumber);
			System.out.println("Grade: " + this.grade);
		}
	}
}
public class UniversityStudentManagement{
	public static void main(String[] args){
		Student stu1 = new Student("Dhanraj", 2115000354, "A");
		stu1.displayStudentDetails();
		Student.displayTotalStudents();
	}
}