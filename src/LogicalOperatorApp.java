
public class LogicalOperatorApp {

	public static void main(String[] args) {
		// 논리 연산자
		
		// AND 연산자
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false

		// OR 연산자
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// NOT 연산자
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
