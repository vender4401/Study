package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i);
		
		class LocalClass {
			int i;
//			static j;
			void method() {}
//			static void method() {}
		}
		
		LocalClass l1 = new LocalClass();
		
	}
}
