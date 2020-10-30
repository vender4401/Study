package chap14.textbook.s140402;

public class UsingLocalVariable {
	
	
	void method(int arg) {	//arg는 final 특성을 가짐
		int localVar = 40;	//localVar는 final 특성을 가짐
		
		//arg = 31;			//final 특성때문에 수정 불가
		//localVar = 41;	//final 특성때문에 수정 불가
		
		//람다식
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
