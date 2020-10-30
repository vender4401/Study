package chap04.textbook;

public class ForprintFrom1To10Example {
	public static void main(String[] args) {
		// 1 -> 2-> code - > 3 -> 2
		// 1~10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}			
		// 10~1
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}
			
		// 11~20
		for (int k = 11; k <= 20; k++) {
			System.out.println(k);
		}
			
		// 1~9 홀수만
		for (int l = 1; l <= 9; l+=2) {
			System.out.println(l);
		}
		// 10~2 짝수만
		for (int m = 10; m >= 2; m-=2) {
			System.out.println(m);
		}
		
		
			
			
		
	}
}
