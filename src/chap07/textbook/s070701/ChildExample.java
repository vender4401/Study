package chap07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); // Parent 클래스에는 method3 가 없기에 호출 불가능
		
	}
}
