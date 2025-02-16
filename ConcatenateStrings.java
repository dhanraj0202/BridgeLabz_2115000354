public class ConcatenateStrings{
	public static void main(String[] args){
		String[] arr = {"hello", "world", "java"};
		StringBuffer sb = new StringBuffer();
		for(String str : arr){
			sb.append(str + " ");
		}
		System.out.println(sb);
	}
}