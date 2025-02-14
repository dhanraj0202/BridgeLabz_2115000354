public class BubbleSort{
	public static int[] sort(int[] arr){
		int temp = 0;
		for(int i = 0; i<arr.length-1; i++){
			for(int j = 0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] marks = {95,93,76,92,84};
		sort(marks);
		
		for(int i = 0; i<marks.length; i++){
			System.out.print(marks[i] + " ");
		}
	}
}