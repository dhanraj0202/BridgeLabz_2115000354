public class SelectionSort{
    public static void sort(int[] scores){
        int n = scores.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(scores[j] < scores[minIndex]){
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args){
		int[] scores = {95,93,76,92,84};
		sort(scores);
		
		for(int i = 0; i<scores.length; i++){
			System.out.print(scores[i] + " ");
		}
	}
}
