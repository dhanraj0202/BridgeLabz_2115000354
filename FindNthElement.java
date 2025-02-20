import java.util.*;

public class FindNthElement{
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
		int n = 2;
		System.out.println(findNthFromEnd(list, n));
	}

	static <T> T findNthFromEnd(LinkedList<T> list, int n){
		Iterator<T> first = list.iterator();
		Iterator<T> second = list.iterator();
		for(int i = 0; i < n; i++){
			if(!first.hasNext()){
				return null;
			}
			first.next();
		}
		while(first.hasNext()){
			first.next();
			second.next();
		}
		return second.next();
	}
}