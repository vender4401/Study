package chap10.textbook.exercises.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println("---------------------------");
			System.out.println(e.getMessage());
			System.out.println("---------------------------");
			e.printStackTrace();
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println("---------------------------");
			System.out.println(e.getMessage());
			System.out.println("---------------------------");
			e.printStackTrace();
		}
	}
	public static void login(String id, String password)throws Exception {
		//id 가 "blue"가 아니라면 NotExistIDException 객체를 생성하여 발생시킴
		if(!id.equals("blue")) {			
			throw new NotExistIDException("아이디가 존재 하지 않습니다.");			
		}
		//password 가 "12345"가 아니라면 WrongPasswordExeption 객체를 생성하여 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
