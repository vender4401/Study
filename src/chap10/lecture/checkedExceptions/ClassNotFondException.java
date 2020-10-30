package chap10.lecture.checkedExceptions;

public class ClassNotFondException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행 1");
		
		try {
			System.out.println("프로그램 실행 try1");
			
			Class.forName("java.lang.String");
			
			System.out.println("프로그램 실행 try2");
		} catch (ClassNotFoundException yk) {
			System.out.println("익셉션 발생!");
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 실행 2");
	}
}
