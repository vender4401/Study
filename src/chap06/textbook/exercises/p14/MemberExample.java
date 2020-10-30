package chap06.textbook.exercises.p14;

public class MemberExample {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "java");
		Member user2 = new Member("홍길동", "java");
		
		System.out.println(user1.name);
		System.out.println(user1.id);
	}
}
