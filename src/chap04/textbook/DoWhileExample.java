package chap04.textbook;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력 하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력 하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //키보드가 입력되는 한줄만 입력 받음 (String타입)
			System.out.println(inputString); 
		} while( ! inputString.equals("q") ); //
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
