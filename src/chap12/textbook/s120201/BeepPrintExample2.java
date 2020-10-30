package chap12.textbook.s120201;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		//위의 내용과 밑 같음
		
		Thread thread2 = new Thread(new BeepTask());
		
		thread.start();
		thread2.start(); 
		
	
			for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);
				} catch (
						Exception e) {
					e.printStackTrace();
				}
			}
		}

}
