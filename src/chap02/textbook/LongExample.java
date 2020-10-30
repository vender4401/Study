package chap02.textbook;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000;	// 컴파일 에러 int 저장값 범위 이상 (2147483647)
									// int로 저장되는 값 이상 값은 숫자 뒤 L을 입력 해줘야 한다.
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}
}
