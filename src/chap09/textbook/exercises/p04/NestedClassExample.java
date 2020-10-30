package chap09.textbook.exercises.p04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire() {
			// 인스턴스 멤버 클래스는 클래스명.new 클래스명() {}
			// Mycar 의 객체를 생성해야만 Tire 의 객체를 사용가능
		};
				
		Car.Engine engine = new Car.Engine() {
			// 정적 멤버 클래스 는 new 클래스명.클래스명() {}
			// A 클래스로 바로 접근 가능
		};
	}
}
