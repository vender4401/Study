package chap02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 -10;
		}
//		int v3 = v1 + v2 + 5; 
		// v2 변수를 사용할수 없기 때문에 컴파일 에러가 생김
		// 변수는 선언된 블록 내에서만 사용 가능
	}

}
