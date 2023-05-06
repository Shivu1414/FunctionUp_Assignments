
public class checkString {
	public static boolean isString(Object value) {
		return value instanceof String;
	}
	public static void main(String args[]) {
		System.out.println(isString("hello"));
		System.out.println(isString(42));
		System.out.println(isString(true));
	}
}
