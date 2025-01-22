public class P5{
	public static void main(String[] args){
		int pens = 14;
		int students = 3;
		int perStudent = pens/students;
		int remPen = pens%students;
		System.out.print("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remPen);
	}
}