package chap09.textbook.s090302;

public class A {
	int field1;					//필드 선언
	
	void method1() {			//메소드 선언
	}
	static int field2;			//정적 필드 선언
	static void method2() {		//정적 메소드 선언
	}
	
	class B {						//인스턴스 멤버 클래스
		void method() {				
			field1 = 10;			// 모든 필드와 메소드에 가능
			method1();
			field2 = 10;
			method2();				// -----A클래스의 객체를 생성해야 B를 사용가능
		}
	}
	static class C {				//정적 멤버 클래스
		void method() {
//			field1 = 10;			// 인스턴스 필드와 메소드는 x
//			method1();
			
			field2 = 10;			// static 필드와 메소드는 o
			method2();				// 바로 접근 할수 있는 C클래스
		}
	}
	
}
