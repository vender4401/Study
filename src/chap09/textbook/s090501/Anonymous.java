package chap09.textbook.s090501;

public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근 합니다");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어 납니다.");
			work();
		}
	};

	void method1() {
		Person lacalVer = new Person() {

			void walk() {
				System.out.println("산책 합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어 납니다.");
				walk();
			}
		};
		// 로컬 변수 사용
//		localVar.wake();

	}

	void method2(Person person) {
		person.wake();
	}
}
