import java.util.Scanner;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String[] arr = new String[num+1];
		int index = 0;
		if(num>0){
			for(int i = 0; i<=num; i++){
				if(i%3==0 && i%5!=0){
					arr[index++] = "Fizz";
				}
				else if(i%3!=0 && i%5==0){
					arr[index++] = "Buzz";
				}
				else if(i%3==0 && i%5==0){
					arr[index++] = "FizzBuzz";
				}
				else{
					arr[index++] = i + "";
				}
			}
		}
		for(int i = 0; i<index; i++){
			System.out.println("Position " + (i) + " = " + arr[i]);
		}
	}
}