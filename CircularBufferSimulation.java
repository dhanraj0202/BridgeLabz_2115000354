import java.util.Arrays;

class CircularBuffer<T>{
	private T[] buffer;
	private int head = 0, tail = 0, size = 0, capacity;

	@SuppressWarnings("unchecked")
	public CircularBuffer(int capacity){
		this.capacity = capacity;
		this.buffer = (T[]) new Object[capacity];
	}

	public void add(T value){
		buffer[tail] = value;
		tail = (tail + 1) % capacity;
		if(size < capacity){
			size++;
		}
		else{
			head = (head + 1) % capacity;
		}
	}

	public T remove(){
		if (size == 0) return null;
		T value = buffer[head];
		head = (head + 1) % capacity;
		size--;
		return value;
	}

	public T[] getBuffer(){
		T[] result = (T[]) new Object[size];
		for(int i = 0; i < size; i++){
			result[i] = buffer[(head + i) % capacity];
		}
		return result;
	}
}

public class CircularBufferSimulation{
	public static void main(String[] args){
		CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
		buffer.add(1);
		buffer.add(2);
		buffer.add(3);
		buffer.add(4);
		System.out.println(Arrays.toString(buffer.getBuffer()));
	}
}