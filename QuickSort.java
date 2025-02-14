public class QuickSort{
	public static void sort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

	public static void main(String[] args){
		int[] prices = {95,93,76,92,84};
		sort(prices, 0, prices.length-1);
		
		for(int i = 0; i<prices.length; i++){
			System.out.print(prices[i] + " ");
		}
	}
}