public class HeapSort{
    public static void sort(int[] salaries){
        int n = salaries.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(salaries, n, i);
        }
        for(int i = n - 1; i > 0; i--){
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && salaries[left] > salaries[largest]){
            largest = left;
        }
        if(right < n && salaries[right] > salaries[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args){
        int[] salaries = {50000,75000,60000,90000,40000,80000};
        sort(salaries);
		
        for(int i = 0; i<salaries.length; i++){
			System.out.print(salaries[i] + " ");
		}
    }
}
