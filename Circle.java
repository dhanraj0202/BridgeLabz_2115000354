class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void displayArea(){
        System.out.println("Area: " + 3.14*radius*radius);
    }
	
	public void displayCircumference(){
		System.out.println("Circumference: " + 2*3.14*radius);
	}

    public static void main(String[] args){
        Circle circle1 = new Circle(7);
        circle1.displayArea();
		circle1.displayCircumference();
    }
}
