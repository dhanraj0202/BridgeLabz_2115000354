class Course{
    String courseName;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class EducationalCourse{
    public static void main(String[] args){
        Course course1 = new Course("Maths", 6);
        OnlineCourse course2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse course3 = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 300, 20);

        course1.displayCourseInfo();
        System.out.println();
        course2.displayCourseInfo();
        System.out.println();
        course3.displayCourseInfo();
    }
}
