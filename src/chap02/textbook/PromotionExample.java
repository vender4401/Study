package chap02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	// int <- byte (작은값에서 큰타입 변경시 자동타입 변환)
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;		// int <- char
		System.out.println("가의 문자=" + charValue);
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;	// long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		System.out.println(doubleValue);
		
		intValue = 300;
		byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		float floatValue = 3;
		short shortValue = 5;
		
		shortValue = 32767;
		floatValue = (float)shortValue;
		System.out.println(floatValue);
		
		
	}
}
