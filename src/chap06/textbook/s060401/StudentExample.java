package chap06.textbook.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); // Student 클래스에 s1 이라는 새로운 객체를 생성 
		System.out.println("s1 변수가 Student 객체를 참조 합니다.");
		
		Student s2 = new Student(); // Student 클래스에 s2 이라는 새로운 객체를 생성 
		System.out.println("s2 변수가 또 다른 Student 객체를 참조 합니다.");
	}
}