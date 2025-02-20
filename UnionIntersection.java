import java.util.*;

public class UnionIntersection{
	public static void main(String[] args){
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

		Set<Integer> union = getUnion(set1, set2);
		Set<Integer> intersection = getIntersection(set1, set2);

		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
    }

	static <T> Set<T> getUnion(Set<T> set1, Set<T> set2){
		Set<T> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

	static <T> Set<T> getIntersection(Set<T> set1, Set<T> set2){
		Set<T> result = new HashSet<>(set1);
		result.retainAll(set2);
		return result;
	}
}