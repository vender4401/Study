package chap05.textbook;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {					//입력된 데이터 개수가 두개가 아닐경우
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);						//프로그램 강제종료
		}
		
		String strNum1 = args[0];				//첫번째 데이터 얻기
		String strNum2 = args[1];				//두번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);	//문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	//문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
