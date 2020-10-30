package chap04.exercises;

import java.util.Scanner;

public class Exercise07scanner {
	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료 ");
			System.out.println("----------------------------------");
			System.out.print("선택");

			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
//			String line = scanner.nextLine();
//			int num = Integer.valueOf(line);

			if (num == 1) {
				System.out.println("얼마 입금?");
				int e = scanner.nextInt();
				balance += e;
			}
			if (num == 2) {
				System.out.println("얼마 뽑을래? : ");
				String f = scanner.nextLine();
				balance = balance - Integer.valueOf(f);
			}
			if (num == 3) {
				System.out.println("통장에 있는 금액은 : " + balance);

			}
			if (num == 4) {
				break;
			}

		}

		System.out.println("프로그램 종료");
	}
}
