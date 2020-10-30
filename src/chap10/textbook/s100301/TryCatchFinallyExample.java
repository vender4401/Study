package chap10.textbook.s100301;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class Claszz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e ) {
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}
}
