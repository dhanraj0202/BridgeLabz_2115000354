public class CompareBufferBuilder{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		long startTime,endTime;
		
		startTime = System.nanoTime();
		for(long i = 0; i<1000000; i++){
			sb1.append("hello");
		}
		endTime = System.nanoTime();
		System.out.println("String Buffer Concatenation time taken " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for(long i = 0; i<1000000; i++){
			sb2.append("hello");
		}
		endTime = System.nanoTime();
		System.out.println("String Builder Concatenation time taken " + (endTime-startTime) + "ns");
	}
}