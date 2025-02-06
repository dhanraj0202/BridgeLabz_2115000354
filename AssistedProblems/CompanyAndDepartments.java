import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department{
    private String name;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName){
        employees.add(new Employee(employeeName));
    }

    public void displayEmployees(){
        System.out.println("Department: " + name);
        for(Employee employee : employees){
            System.out.println("Employee: " + employee.getName());
        }
    }
}

class Company{
    private String name;
    private List<Department> departments;

    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName){
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName){
        for(Department department : departments){
            if(departmentName.equals(departmentName)){
                department.addEmployee(employeeName);
                break;
            }
        }
    }

    public void displayCompanyDetails(){
        System.out.println("Company: " + name);
        for(Department department : departments){
            department.displayEmployees();
        }
    }
}

public class CompanyAndDepartments{
    public static void main(String[] args){
        Company company = new Company("Capegemini");

        company.addDepartment("Engineering");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("Engineering", "Dhanraj");
        company.addEmployeeToDepartment("Engineering", "Rahul");
        company.addEmployeeToDepartment("HR", "Aryan");

        company.displayCompanyDetails();
    }
}
