import java.util.Stack;

public class QueueUsingStack{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }
	
	public static void main(String[] args){
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
