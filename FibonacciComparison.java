public class FibonacciComparison{
	public static int fibonacciRecursive(int n){
		if(n <= 1){
		return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciIterative(int n){
		int a = 0, b = 1, sum;
		for(int i = 2; i <= n; i++){
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[] args){
		int[] nValues = {10, 30, 50};

		for(int n : nValues){
			long startTime = System.nanoTime();
			if(n > 40){
				System.out.println("Recursive Solution for N=" + n + " is Unfeasible.");
			}
			else{
				fibonacciRecursive(n);
				long endTime = System.nanoTime();
				System.out.println("Recursive Time for N=" + n + ": " + (endTime-startTime)/ 1000000.0 + "ms");
			}

			startTime = System.nanoTime();
			fibonacciIterative(n);
			long endTime = System.nanoTime();
			System.out.println("Iterative Time for N=" + n + ": " + (endTime-startTime)/1000000.0 + "ms");
		}
	}
}
