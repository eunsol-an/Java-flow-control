
public class EqualsApp {

	public static void main(String[] args) {
		// == vs equals
		
		int a = 1;
		int b = 1;
		System.out.println(a == b); // true
		
		// new 키워드를 이용한 방식
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		System.out.println(s1 == s2); // false
		
		// 리터럴을 이용한 방식
		String s3 = "JAVA";
		String s4 = "JAVA";
		System.out.println(s3 == s4); // true
		
		System.out.println(s1.equals(s4)); // true

	}

}
