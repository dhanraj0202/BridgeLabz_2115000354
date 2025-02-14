public class MergeSort{
	public static void sort(int[] arr, int left, int right){
		if(left < right){
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
	}
	
	public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArr[i] = arr[left + i];
		}
        for(int j = 0; j < n2; j++){
            rightArr[j] = arr[mid + 1 + j];
		}

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }
			else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i < n1){
			arr[k++] = leftArr[i++];
		}
        while(j < n2){
			arr[k++] = rightArr[j++];
		}
    }

	public static void main(String[] args){
		int[] prices = {95,93,76,92,84};
		sort(prices, 0, prices.length-1);
		
		for(int i = 0; i<prices.length; i++){
			System.out.print(prices[i] + " ");
		}
	}
}