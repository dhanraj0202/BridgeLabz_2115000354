import java.util.*;

class Patient implements Comparable<Patient>{
	private String name;
	private int severity;

	public Patient(String name, int severity){
		this.name = name;
		this.severity = severity;
	}

	public String getName(){
		return name;
	}

	public int getSeverity(){
		return severity;
	}

	@Override
	public int compareTo(Patient other){
		return Integer.compare(other.severity, this.severity);
	}

	@Override
	public String toString(){
		return name + " (Severity: " + severity + ")";
	}
}

public class HospitalTriageSystem{
	public static void main(String[] args){
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>();
		triageQueue.offer(new Patient("Dhanraj", 3));
		triageQueue.offer(new Patient("Rahul", 5));
		triageQueue.offer(new Patient("Nikhil", 2));

		while(!triageQueue.isEmpty()){
			System.out.println(triageQueue.poll());
		}
	}
}