import java.util.*;

class StackUsingQueues<T>{
	private Queue<T> queue1 = new LinkedList<>();
	private Queue<T> queue2 = new LinkedList<>();

	public void push(T value){
		queue1.offer(value);
	}

	public T pop(){
		if(queue1.isEmpty()){
			return null;
		}
		while(queue1.size() > 1){
			queue2.offer(queue1.poll());
		}
		T topElement = queue1.poll();
		Queue<T> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return topElement;
	}

	public T top(){
		if(queue1.isEmpty()){
			return null;
		}
		while(queue1.size() > 1){
			queue2.offer(queue1.poll());
		}
		T topElement = queue1.poll();
		queue2.offer(topElement);
		Queue<T> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return topElement;
	}

	public boolean isEmpty(){
		return queue1.isEmpty();
	}
}

public class StackUsingQueue{
	public static void main(String[] args){
		StackUsingQueues<Integer> stack = new StackUsingQueues<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
	}
}