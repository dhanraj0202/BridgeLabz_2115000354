public class InsertionSort{
	public static int[] sort(int[] arr){
		for(int i = 1; i<arr.length; i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] ids = {95,93,76,92,84};
		sort(ids);
		
		for(int i = 0; i<ids.length; i++){
			System.out.print(ids[i] + " ");
		}
	}
}