public class SearchNegative{
    public static int findFirstNegative(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {3, 7, 0, -5, 9, -2, 8};

        int result = findFirstNegative(numbers);

        if(result != -1){
            System.out.println("First negative number found at index: " + result);
        }
		else{
            System.out.println("No negative number found in the array.");
        }
    }
}
