import java.util.*;

public class ReverseList{
	public static void main(String[] args){
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> linkedList = new LinkedList<>(arrayList);

		reverseList(arrayList);
		reverseList(linkedList);

		System.out.println("Reversed using ArrayList");
		System.out.println(arrayList);
		System.out.println("Reversed using LinkedList");
		System.out.println(linkedList);
	}

	static void reverseList(List<Integer> list){
		int left = 0, right = list.size() - 1;
		while(left < right){
			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}
	}
}