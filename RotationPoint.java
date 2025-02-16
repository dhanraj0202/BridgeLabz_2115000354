public class RotationPoint{
    public static int findRotationIndex(int[] arr){
        int left = 0, right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            }
			else{
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args){
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int rotationIndex = findRotationIndex(arr);
        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
