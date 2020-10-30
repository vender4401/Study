package chap07.lecture.superConstructor;

public class ChlidClass extends ParentClass {
	public ChlidClass() {
		super(1);
	}
	
	@Override
	void method1() {
		super.method1() {
			super.method1();
			System.out.println();
		}
	}
}
