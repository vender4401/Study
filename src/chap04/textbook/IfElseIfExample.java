package chap04.textbook;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 75;
		if (score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~90입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~80입니다.");
			System.out.println("등급은 C 입니다.");
		}else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
