public class ReverseString{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}