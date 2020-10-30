// for 문을 이용해서 1부터100까지의 정수 중에서
// 3의 배수의 총합을 구하는 코드를 작성해 보세요.


package chap04.exercises;

public class Exercise03scanner {
	public static void main(String[] args) {
		int sum = 0;
	
	for (int i = 3; i <= 100; i+=3) {
		sum += i;
	}
	System.out.println("1~100합 : " + sum);
	}
}
