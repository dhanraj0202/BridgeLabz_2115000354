public class Circle{
	private double radius;
	
	public Circle(){
		this(3.0);
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	void displayCircleDetails(){
		System.out.println("Radius: " + radius);
	}
	
	public static void main(String[] args){
		Circle circle1 = new Circle();
		circle1.displayCircleDetails();
		Circle circle2 = new Circle(4.0);
		circle2.displayCircleDetails();
	}
}