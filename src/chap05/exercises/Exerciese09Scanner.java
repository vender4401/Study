package chap05.exercises;

import java.util.Scanner;

public class Exerciese09Scanner {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("입력>");
//		String str = scanner.nextLine();
//		int val = Integer.valueOf(str);
//		
//		System.out.println("출력>");
//		System.out.println("String 타입으로 출력" + str);
//		System.out.println("int 타입으로 출력" + val);
//		
//		System.out.println("정수입력>");
//		val = scanner.nextInt();
//		
//		System.out.println("정수출력>");
//		System.out.println("nextInt로 받은 값 출력 : " + val);
		
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; 
		int max = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1학생수|2점수입력|3점수리스트|4분석|5종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수는 몇명 입니까?");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i<studentNum; i++) {
					System.out.print(" [ " +  i  + " ] " + "의 점수는? ");
					scores[i] = scanner.nextInt();
				}				
								
			} else if(selectNo == 3) {
				for (int i = 0; i<studentNum; i ++) {
					System.out.println(" [ " +  i  + " ] " + "의 점수값 : " + scores[i] + " 입니다.");					
				}
			} else if(selectNo == 4) {
				int sum = 0;				
				
				for(int i = 0; i<scores.length; i++) {
					max = (max > scores[i]) ? max : scores[i];
					
				}
				
				System.out.println("최고 점수 : " + max);
				
				System.out.println("평균 점수 : " + sum /scores.length);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료");
		
		
	}
}
