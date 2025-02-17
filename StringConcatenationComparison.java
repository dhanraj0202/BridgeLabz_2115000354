public class StringConcatenationComparison{

	public static long testStringConcatenation(int N){
		if(N > 10_000){
			System.out.println("String Concatenation: Skipped (Unfeasible for large N)");
			return -1;
		}

		long startTime = System.nanoTime();
		String str = "";
		for(int i = 0; i < N; i++){
			str += "a";
		}
		return (System.nanoTime()-startTime)/1000000;
	}

	public static long testStringBuilder(int N){
		long startTime = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			sb.append("a");
		}
		return (System.nanoTime()-startTime)/1000000;
	}

	public static long testStringBuffer(int N){
		long startTime = System.nanoTime();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++){
			sb.append("a");
		}
		return (System.nanoTime()-startTime)/1000000;
	}

	public static void main(String[] args){
		int[] sizes = {1000, 10000, 1000000};

		for(int N : sizes){
			System.out.println("Testing with N = " + N);

			long timeString = testStringConcatenation(N);
			if(timeString != -1){
				System.out.println("String Concatenation: " + timeString + " ms");
			}

			long timeBuilder = testStringBuilder(N);
			System.out.println("StringBuilder Concatenation: " + timeBuilder + " ms");

			long timeBuffer = testStringBuffer(N);
			System.out.println("StringBuffer Concatenation: " + timeBuffer + " ms");

			System.out.println();
		}
	}
}
