class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA(){
        return CGPA;
    }

    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }

    public void displayStudentDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student{

    public PostgraduateStudent(int rollNumber, String name, double CGPA){
        super(rollNumber, name, CGPA);
    }

    public void displayPGStudentDetails(){
        displayStudentDetails();
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args){
        Student s1 = new Student(101, "Alice", 3.8);
        PostgraduateStudent pg1 = new PostgraduateStudent(102, "Bob", 3.9);

        s1.displayStudentDetails();
        pg1.displayPGStudentDetails();

        s1.setCGPA(4.0);
        System.out.println("Updated CGPA of " + s1.name + ": " + s1.getCGPA());
    }
}
