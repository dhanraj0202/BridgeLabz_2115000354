import java.util.*;

public class GenerateBinary{
	public static void main(String[] args){
		int N = 5;
		List<String> binaryNumbers = generateBinaryNumbers(N);
		System.out.println(binaryNumbers);
	}

	static List<String> generateBinaryNumbers(int N){
		List<String> result = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");

		for(int i = 0; i < N; i++){
			String binary = queue.poll();
			result.add(binary);
			queue.offer(binary + "0");
			queue.offer(binary + "1");
		}

		return result;
	}
}