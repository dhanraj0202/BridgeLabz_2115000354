import java.util.*;

public class ReverseQueue{
	public static void main(String[] args){
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
		reverseQueue(queue);
		System.out.println(queue);
	}

	static <T> void reverseQueue(Queue<T> queue){
		Stack<T> stack = new Stack<>();
		while(!queue.isEmpty()){
			stack.push(queue.poll());
		}
		while(!stack.isEmpty()){
			queue.offer(stack.pop());
		}
	}
}