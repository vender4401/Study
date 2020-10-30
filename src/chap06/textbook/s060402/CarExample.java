package chap06.textbook.s060402;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();

		// 필드값 읽기
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		// 필드값 변경  // 위에 새로만들어진 객체에 값을 다시 할당 시킴
		myCar.speed = 60;
		myCar.color = "빨간색";
		System.out.println("수정된 속도 : " + myCar.speed);
		System.out.println("수정된 속도 : " + myCar.color);
		
	}
	

}
