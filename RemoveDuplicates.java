import java.util.*;

public class RemoveDuplicates{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
		List<Integer> result = removeDuplicates(list);
		System.out.println(result);
	}

	static <T> List<T> removeDuplicates(List<T> list){
		Set<T> seen = new HashSet<>();
		List<T> result = new ArrayList<>();
		for(T item : list){
			if(seen.add(item)){
				result.add(item);
			}
		}
		return result;
	}
}