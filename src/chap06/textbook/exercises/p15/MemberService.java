package chap06.textbook.exercises.p15;

public class MemberService {
	
	String id = "hong";
	String pass = "12345";

	
	boolean login(String id, String password) {
		if(id == this.id) {
			if(password == this.pass) {
				return true;
			}
		} 
		return false;
		
	}
	
	void logout(String id) {
		
		System.out.println("로그 아웃 되었습니다.");
	}
	
}
