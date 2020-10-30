package chap06.lecture.constructor;

public class ConstructorEx02 {
	public static void main(String[] args) {
		Hero a = new Hero("ironman", 100);
		Hero b = new Hero("thor", 90);
		System.out.println(a.name);
		System.out.println(a.power);
		System.out.println(b.name);
		System.out.println(b.power);
		
		Hero c = new Hero("spider");
		System.out.println(c.name);
		System.out.println(c.power);
		
	}
}

