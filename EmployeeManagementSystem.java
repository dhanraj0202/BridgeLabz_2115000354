import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public int getEmployeeId(){
		return employeeId;
	}
	
    public String getName() {
		return name;
	}
	
    public double getBaseSalary(){
		return baseSalary;
	}
}

interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
    private double bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus){
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String department){
        this.department = department;
    }

    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked){
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String department){
        this.department = department;
    }

    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Dhanraj", 5000, 1000);
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Deepak", 20, 120);

        emp1.assignDepartment("HR");
        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);

        for(Employee emp : employees){
            emp.displayDetails();
            if(emp instanceof Department){
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
