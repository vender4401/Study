package chap06.textbook.s061303.package2;

import chap06.textbook.s061303.package1.A;

public class C {
	public C() {
		A a= new A();
		a.field1 = 1;
//		a.field2 = 1;			// private 필드 접근 불가 (컴파일에러)
//		a.field3 = 1;			// private 필드 접근 불가 (컴파일에러)
		
		a.method1();
//		a.method2();			// private 필드 접근 불가 (컴파일에러)
//		a.method3();			// private 필드 접근 불가 (컴파일에러)
	}
}

