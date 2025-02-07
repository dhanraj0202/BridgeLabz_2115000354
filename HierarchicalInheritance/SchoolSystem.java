class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person{
    private String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    void displayRole(){
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person{
    private int grade;

    Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    void displayRole(){
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person{
    private String department;

    Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    void displayRole(){
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem{
    public static void main(String[] args){
        Teacher teacher = new Teacher("Mr. Dhanraj", 40, "Mathematics");
        Student student = new Student("Aryan", 16, 10);
        Staff staff = new Staff("Mrs. Deepak", 35, "Administration");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
