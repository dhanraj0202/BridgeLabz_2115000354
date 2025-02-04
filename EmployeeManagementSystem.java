class Employee{
	static String companyName = "Capegemini";
	private String name;
	final int id;
	private String designation;
	static int totalEmployees;	
	static void displayTotalEmployees(){
		System.out.println("Total Employees: " + totalEmployees);
	}
	
	Employee(String name, int id, String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmployees++;
	}
	
	void displayEmployeeDetails(){
		if(this instanceof Employee){
			System.out.println("Company Name: " + this.companyName);
			System.out.println("Name: " + this.name);
			System.out.println("Employee ID: " + this.id);
			System.out.println("Designation: " + this.designation);
		}
	}
}
public class EmployeeManagementSystem{
	public static void main(String[] args){
		Employee emp1 = new Employee("Dhanraj", 2115000354, "HR");
		emp1.displayEmployeeDetails();
		Employee.displayTotalEmployees();
	}
}