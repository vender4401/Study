package chap07.textbook.exercises.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		

		
		System.out.println(tire == snowTire);
		
		snowTire.run();
		tire.run();

	}
}
