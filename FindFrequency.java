import java.util.*;

public class FindFrequency{
	public static void main(String[] args){
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
		Map<String, Integer> frequencyMap = getFrequency(list);
		System.out.println(frequencyMap);
	}

	static Map<String, Integer> getFrequency(List<String> list){
		Map<String, Integer> map = new HashMap<>();
		for(String s : list){
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return map;
	}
}