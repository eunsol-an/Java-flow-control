
public class AuthApp {

	public static void main(String[] args) {
		// if문 응용
		
		String id = "oneul";
		String inputId = args[0];
		
		String pass = "1234";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		// if문 중첩해서 사용
		if(inputId.equals(id)) {
			if(inputPass.equals(pass)) {
				System.out.println("Master!");
			} else {
				System.out.println("Wrong Password!");
			}
		} else {
			System.out.println("Who are you?");
		}
		
		// 논리 연산자 && 사용
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
