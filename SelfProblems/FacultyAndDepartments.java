import java.util.ArrayList;
import java.util.List;

class Faculty{
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department{
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name){
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        facultyMembers.add(faculty);
    }

    public void displayFaculty(){
        System.out.println("Department: " + name + " - Faculty Members:");
        for(Faculty faculty : facultyMembers){
            System.out.println(faculty.getName());
        }
    }

    public String getName(){
        return name;
    }
}

class University{
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String departmentName){
        departments.add(new Department(departmentName));
    }

    public void addFaculty(Faculty faculty){
        facultyMembers.add(faculty);
    }

    public void assignFacultyToDepartment(String departmentName, Faculty faculty){
        for(Department department : departments){
            if(department.getName().equals(departmentName)){
                department.addFaculty(faculty);
                break;
            }
        }
    }

    public void displayUniversityDetails(){
        System.out.println("University: " + name);
        for(Department department : departments){
            department.displayFaculty();
        }
        System.out.println("Independent Faculty Members:");
        for(Faculty faculty : facultyMembers){
            System.out.println(faculty.getName());
        }
    }
}

public class FacultyAndDepartments{
    public static void main(String[] args){
        University university = new University("GLA");

        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        Faculty faculty1 = new Faculty("Dr. Dhanraj");
        Faculty faculty2 = new Faculty("Dr. Nitin");
        Faculty faculty3 = new Faculty("Dr. Aryan");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        university.assignFacultyToDepartment("Computer Science", faculty1);
        university.assignFacultyToDepartment("Mathematics", faculty2);

        university.displayUniversityDetails();
    }
}
