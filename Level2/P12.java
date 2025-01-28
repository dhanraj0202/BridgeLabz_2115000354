import java.util.Random;
public class P12{
    public static int[] generate4DigitRandomArray(int size){
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) numbers[i] = 1000 + rand.nextInt(9000);
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int sum = 0, min = numbers[0], max = numbers[0];
        for(int num : numbers){
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }
    public static void main(String[] args){
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);
        System.out.println("Random Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + results[0] + ", Min: " + results[1] + ", Max: " + results[2]);
    }
}
