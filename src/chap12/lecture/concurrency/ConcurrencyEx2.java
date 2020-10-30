package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	static int field1 = 0;
//	static int field2 = 0;

	
	public synchronized static void inc() {
		field1++;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field1++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field1++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field1);
			}
		};
		t1.start();
		t2.start();
	}
}
