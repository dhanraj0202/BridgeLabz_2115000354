class Employee{
	String name;
	int id;
	int salary;
	
	Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
		this.salary = salary;
    }
	
	void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
	}
}

class Manager extends Employee{
	private int teamSize;
	Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
		this.teamSize = teamSize;
    }
	
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Team Size: " + teamSize);
	}
}

class Developer extends Employee{
	private String programmingLanguage;
	Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
    }
	
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}

class Intern extends Employee{
	private int trainingPeriod;
	Intern(String name, int id, int salary, int trainingPeriod) {
        super(name, id, salary);
		this.trainingPeriod = trainingPeriod;
    }
	
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Training Period: " + trainingPeriod + " months");
	}
}

public class EmployeeManagementSystem{
    public static void main(String[] args){
        Employee manager1 = new Manager("Rahul", 11, 60000, 5);
        Employee developer1 = new Developer("Dhanraj", 12, 45000, "Java");
        Employee intern1 = new Intern("Aryan", 13, 25000, 4);

        manager1.displayDetails();
        developer1.displayDetails();
        intern1.displayDetails();
    }
}