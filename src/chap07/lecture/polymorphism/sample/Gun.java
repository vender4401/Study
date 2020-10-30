package chap07.lecture.polymorphism.sample;

public class Gun extends Hero {
	@Override
	public void fire() {
		System.out.println("불이 나갑니다.");
	}
}
