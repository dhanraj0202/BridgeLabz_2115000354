import java.util.*;

public class SetCompare{
	public static void main(String[] args){
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
		System.out.println(areSetsEqual(set1, set2));
	}

	static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2){
		return set1.equals(set2);
	}
}