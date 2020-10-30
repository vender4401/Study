package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char : 2byte
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab';	// 컴파일 에러 : 하나의 문자만 표현이 가능함
//		charValue = '';		// 컴파일 에러 : 빈 문자열을 넣을수 없음.
		charValue = ' ';
		
		charValue = 44032;
		System.out.println(charValue);

		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00';
		System.out.println(charValue);
	}

}
