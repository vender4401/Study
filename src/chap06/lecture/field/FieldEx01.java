package chap06.lecture.field;

public class FieldEx01 {
	public static void main(String[] args) {
		int i;
		i = 3;
		Car c1 = new Car();
		c1.name = "kia";
		c1.model = "k7";
		c1.price = 500;
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();
		c2.model = "hyundai";
		System.out.println(c2.name);
		System.out.println(c2.price);
		
		
	}


}
