package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
			
		// 11~20		
		int j = 11;
			
		while (j<=20) {
			System.out.println(j);
			j++;
		}
		int k = 1;
		// 1~9홀수만
		while (k<=9) {
			System.out.println(k);
			k+=2;
		}
		int l = 10;
		// 10~1
		while (l>=1) {
			System.out.println(l);
			l--;
		}
		int m = 10;
		// 10~2짝수만
		while (m>=2) {
			System.out.println(m);
			m-=2;
		}
		
			
			
		
	}
}
