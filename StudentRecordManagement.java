class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList{
    Student head;

    void addAtBeginning(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    void addAtEnd(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        if(head == null){
            head = newStudent;
            return;
        }
        Student temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    void addAtPosition(int rollNumber, String name, int age, char grade, int position){
        if(position <= 0){
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for(int i = 1; temp != null && i < position; i++){
            temp = temp.next;
        }
        if(temp == null){
			return;
		}
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteByRollNumber(int rollNumber){
        if(head == null){
			return;
		}
        if(head.rollNumber == rollNumber){
            head = head.next;
            return;
        }
        Student temp = head;
        while(temp.next != null && temp.next.rollNumber != rollNumber){
            temp = temp.next;
        }
        if(temp.next == null){
			return;
		}
        temp.next = temp.next.next;
    }

    Student searchByRollNumber(int rollNumber){
        Student temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
				return temp;
			}
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int rollNumber, char newGrade){
        Student student = searchByRollNumber(rollNumber);
        if(student != null){
			student.grade = newGrade;
		}
    }

    void display(){
        Student temp = head;
        while(temp != null){
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement{
    public static void main(String[] args){
        StudentList list = new StudentList();
        list.addAtEnd(101, "Dhanraj", 20, 'A');
        list.addAtEnd(102, "Rahul", 21, 'B');
        list.addAtBeginning(100, "Nakul", 19, 'A');
        list.addAtPosition(103, "Rohit", 22, 'C', 2);
        list.display();
        System.out.println("Searching for Roll Number 102:");
        Student found = list.searchByRollNumber(102);
        if(found != null){
			System.out.println("Found: " + found.name);
		}
        list.updateGrade(101, 'A');
        list.deleteByRollNumber(100);
        System.out.println("Updated List:");
        list.display();
    }
}