
public class AuthApp2 {

	public static void main(String[] args) {
		// 조건문 종합
		
		String id = "oneul";
		String inputId = args[0];
		
		String pass = "1234";
		String pass2 = "4321";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		// 논리 연산자 && || 사용
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
