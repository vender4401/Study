package chap08.textbook.s080701;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("디플트 MyInterface-method2() 실행");
	}
}
