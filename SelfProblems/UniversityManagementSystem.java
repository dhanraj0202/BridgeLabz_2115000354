import java.util.ArrayList;
import java.util.List;

class Course{
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void assignProfessor(Professor professor){
        this.professor = professor;
    }

    public void enrollStudent(Student student){
        students.add(student);
        student.addCourse(this);
    }

    public void displayCourseDetails(){
        System.out.println("Course: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for(Student student : students){
            System.out.println(student.getName());
        }
    }
}

class Professor{
    private String name;
    private List<Course> courses;

    public Professor(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void assignCourse(Course course){
        courses.add(course);
        course.assignProfessor(this);
    }

    public void displayAssignedCourses(){
        System.out.println("Professor: " + name + " - Assigned Courses:");
        for(Course course : courses){
            System.out.println(course.getName());
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

    public void addCourse(Course course){
        courses.add(course);
    }

    public void enrollCourse(Course course){
        course.enrollStudent(this);
    }

    public void displayEnrolledCourses(){
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for(Course course : courses){
            System.out.println(course.getName());
        }
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args){
        Student student1 = new Student("Dhanraj");
        Student student2 = new Student("Aryan");

        Professor professor1 = new Professor("Dr. Rahul");
        Professor professor2 = new Professor("Dr. Ankit");

        Course course1 = new Course("Maths");
        Course course2 = new Course("Computer Science");

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        professor1.displayAssignedCourses();
        professor2.displayAssignedCourses();

        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
    }
}
