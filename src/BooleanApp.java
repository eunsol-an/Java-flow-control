
public class BooleanApp {

	public static void main(String[] args) {
		// Data type 데이터 타입
		
		System.out.println("One"); // String 문자열
		System.out.println(1); // Integer 정수
		
		// Boolean Data type 
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		// String true = "Hello world"; 변수의 이름으로 사용할 수 없다 (reserved word)
		
		System.out.println(foo.contains("world")); // true
		System.out.println(foo.contains("wor")); // true
		System.out.println(foo.contains("word")); // false

	}

}
