public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
	
	void displayPersonDetails(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args){
		Person person1 = new Person("Dhanraj", 23);
		person1.displayPersonDetails();
		Person person2 = new Person(person1);
		person2.displayPersonDetails();
	}
}
