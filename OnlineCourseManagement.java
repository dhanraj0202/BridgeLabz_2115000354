class Course{
	String courseName;
	int duration;
	int fee;
	static String instituteName;
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	void displayCourseDetails(){
		System.out.println("Institute Name: " + instituteName);
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " months");
		System.out.println("Fee: " + fee);
	}
	
	static void updateInstituteName(String newName){
		instituteName = newName;
	}
}
public class OnlineCourseManagement{
	public static void main(String[] args){
		Course.updateInstituteName("GLA University");
		
		Course course1 = new Course("Java", 2, 1500);
		Course course2 = new Course("Python", 4, 2000);
		course1.displayCourseDetails();
		course2.displayCourseDetails();
	
	}
}