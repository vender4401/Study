package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개

		// 1 byte 2 byte 4 byte 8 byte
		// boolean char
		// byte short int long
		// float double

		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;

		// 자동 형 변환 (type 변환)
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;

		// 강제 형 변환
		longValue = 2300000000L;
		intValue = (int) longValue;
		System.out.println(intValue);

		// 자동 형 변환 (정수->실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;

		doubleValue = intValue;
		floatValue = intValue;

		// 강제 형 변환 (실수->정수)
		intValue = (int) floatValue;
		
		

	}
}
