package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();   <--Vehicle 인터페이스에는 checkFare없음.
		
		Bus bus = (Bus) vehicle;	// 강제 타입 변환
		
		bus.run();
		bus.checkFare();        //<--Bus 클래스에는 CheckFare있음.
		
		System.out.println("---------");
		
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
