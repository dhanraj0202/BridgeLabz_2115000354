import java.util.Scanner;
public class P8{
    public static int findYoungest(int[] ages){
        int youngest = ages[0];
        for (int age : ages) if (age < youngest) youngest = age;
        return youngest;
    }
    public static double findTallest(double[] heights){
        double tallest = heights[0];
        for (double height : heights) if (height > tallest) tallest = height;
        return tallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest friend is: " + findYoungest(ages));
        System.out.println("Tallest friend is: " + findTallest(heights));
    }
}
