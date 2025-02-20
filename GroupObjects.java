import java.util.*;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String department;

	public Employee(String name, String department){
		this.name = name;
		this.department = department;
	}

	public String getName(){
		return name;
	}

	public String getDepartment(){
		return department;
	}

	@Override
	public String toString(){
		return name;
	}
}

public class GroupObjects{
	public static void main(String[] args){
		List<Employee> employees = Arrays.asList(
				new Employee("Dhanraj", "HR"),
				new Employee("Aryan", "IT"),
				new Employee("Rahul", "HR")
		);

		Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
		System.out.println(groupedEmployees);
	}

	static Map<String, List<Employee>> groupByDepartment(List<Employee> employees){
		return employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
	}
}