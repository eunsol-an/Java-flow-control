
public class IfApp {

	public static void main(String[] args) {
		// if문
		
		System.out.println("a");
		
		// if문 중첩하여 사용 가능(비추)
//		if(false) {
//			System.out.println(1);
//		} else {
//			if(true) {
//				System.out.println(2);
//			} else {
//				System.out.println(3);
//			}
//		}
		
		// else if를 사용하는 것이 더 좋다.
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		System.out.println("b");

	}

}
