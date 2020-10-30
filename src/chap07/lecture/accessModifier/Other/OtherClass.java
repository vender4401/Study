package chap07.lecture.accessModifier.Other;

import chap07.lecture.accessModifier.MyClass;

public class OtherClass extends MyClass {
	void method1() {
		MyClass o1 = new MyClass(); {
			System.out.println(o1.publicVar);
			System.out.println(protectedVar);
		}
	}
}