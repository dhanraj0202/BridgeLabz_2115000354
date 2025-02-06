import java.util.ArrayList;
import java.util.List;

class Course{
    private String name;
    private List<Student> students;

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void enrollStudent(Student student){
        students.add(student);
    }

    public void displayEnrolledStudents(){
        System.out.println("Course: " + name + " - Enrolled Students:");
        for(Student student : students){
            System.out.println(student.getName());
        }
    }
}

class Student{
    private String name;
    private List<Course> courses;

    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void enrollInCourse(Course course){
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewEnrolledCourses(){
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for(Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

class School{
    private String name;
    private List<Student> students;

    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        System.out.println("School: " + name + " - Students:");
        for(Student student : students){
            System.out.println(student.getName());
        }
    }
}

public class SchoolAndStudents{
    public static void main(String[] args){
        School school = new School("Delhi Public School");

        Student student1 = new Student("Dhanraj");
        Student student2 = new Student("Aryan");

        school.addStudent(student1);
        school.addStudent(student2);

        Course math = new Course("Maths");
        Course science = new Course("Science");

        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);

        school.displayStudents();

        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}
