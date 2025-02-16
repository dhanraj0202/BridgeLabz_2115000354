public class FirstAndLastOccurrence{
    public static int findFirstOccurrence(int[] arr, int target){
        int left = 0, right = arr.length - 1, first = -1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target){
                first = mid;
                right = mid - 1;
            }
			else if(arr[mid] < target){
                left = mid + 1;
            }
			else{
                right = mid - 1;
            }
        }
        
        return first;
    }

    public static int findLastOccurrence(int[] arr, int target){
        int left = 0, right = arr.length - 1, last = -1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target){
                last = mid;
                left = mid + 1;
            }
			else if(arr[mid] < target) {
                left = mid + 1;
            }
			else{
                right = mid - 1;
            }
        }
        
        return last;
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 4, 4, 7, 8, 9};
        int target = 4;

        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        if(firstIndex == -1){
            System.out.println("Element not found.");
        }
		else{
            System.out.println("First occurrence: " + firstIndex);
            System.out.println("Last occurrence: " + lastIndex);
        }
    }
}
