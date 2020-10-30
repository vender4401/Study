package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1.....");
	}
	void method1(int i) {
		System.out.println("method1#####");
	}
	void method1(String text) {
		System.out.println("method1*****");
	}
	void method1(double i) {
		System.out.println("method1^^^^^");
	}
	void method1(int i, int j) {
		System.out.println("method1#####");
	}
	void method1(double j, int i) {
		System.out.println("method1#####");
	}
	void method1(int i, double j) {
		System.out.println("method1#####");
	}
}
