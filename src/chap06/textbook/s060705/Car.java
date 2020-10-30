package chap06.textbook.s060705;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {	
		
	}
	Car(String model) {
		this(model,"은색", 250);	//호출
	}
	Car(String model, String color) {
		this(model,color, 250);		//호출
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;			// 공통실행코드
		this.color = color;			// 공통실행코드
		this.maxSpeed = maxSpeed;	// 공통실행코드
	}
}
