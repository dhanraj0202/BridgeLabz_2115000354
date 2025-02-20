import java.util.*;

public class RotateElements{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		int positions = 2;
		rotateList(list, positions);
		System.out.println(list);
	}

	static <T> void rotateList(List<T> list, int positions){
		int size = list.size();
		positions = positions % size;
		if(positions == 0){
			return;
		}
		List<T> temp = new ArrayList<>(list.subList(0, positions));
		list.subList(0, size - positions-1).clear();
		list.addAll(temp);
	}
}