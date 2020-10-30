package chap02.variable;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전 (단항)
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		// 이항
		// & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		// | or : 같은 자리의 bit가 0인 경우만 0, 나머지 1
		// ^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
		// 피연산자 : integer (int타입)
		// 결과 : integer (int타입)
		
		int a = 45;
		// 45의 비트 : 0010 1101
		// 25의 비트 : 0001 1001
		int b = 25;				
		System.out.println(a & b);
		// 0010 1101
		// 0001 1001
		// 0000 1001
		System.out.println(a | b);
		// 0010 1101
		// 0001 1001
		// 0011 1101
		System.out.println(a ^ b);
		// 0010 1101
		// 0001 1001
		// 0011 0100
		
		// bit shift 연산자
		// >> : 각 bit를 왼쪽으로 옮김
		// << : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트로 채움
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
		
		int val = 1986;
		System.out.println(val << 1);
		val = 98;
		System.out.println(val >> 1);
		val = -21;
		System.out.println(val >> 1);
		val = -6053;
		System.out.println(val >>> 1);
		
		
		
		
	}
}
