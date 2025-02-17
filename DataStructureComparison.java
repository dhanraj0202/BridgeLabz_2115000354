import java.util.*;

public class DataStructureComparison{
	public static boolean arraySearch(int[] arr, int target){
		for(int i : arr){
			if(i == target){
				return true;
			}
		}
		return false;
		}

	public static boolean hashSetSearch(HashSet<Integer> set, int target){
		return set.contains(target);
	}

	public static boolean treeSetSearch(TreeSet<Integer> set, int target){
		return set.contains(target);
	}

	public static void main(String[] args){
		int[] nValues = {1000, 100000, 1000000}; 
        
		for(int n : nValues){
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) arr[i] = i;

			HashSet<Integer> hashSet = new HashSet<>();
			for (int i = 0; i < n; i++) hashSet.add(i);

			TreeSet<Integer> treeSet = new TreeSet<>();
			for (int i = 0; i < n; i++) treeSet.add(i);

			Random rand = new Random();
			int target = rand.nextInt(n);

			long startTime = System.nanoTime();
			arraySearch(arr, target);
			long endTime = System.nanoTime();
			System.out.println("Array Search Time for N=" + n + ": " + (endTime-startTime)/1000000.0 + "ms");

			startTime = System.nanoTime();
			hashSetSearch(hashSet, target);
			endTime = System.nanoTime();
			System.out.println("HashSet Search Time for N=" + n + ": " + (endTime-startTime)/1000000.0 + "ms");

			startTime = System.nanoTime();
			treeSetSearch(treeSet, target);
			endTime = System.nanoTime();
			System.out.println("TreeSet Search Time for N=" + n + ": " + (endTime-startTime)/1000000.0 + "ms");
		}
	}
}
