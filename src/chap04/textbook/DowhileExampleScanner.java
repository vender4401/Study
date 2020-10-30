package chap04.textbook;

import java.util.Scanner;

public class DowhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력");
				
		String line = scanner.nextLine(); //키보드가 입력되는 한줄만 입력 받음 (String타입)
		
		System.out.println("출력");
		System.out.println(line);
		
	}
}
