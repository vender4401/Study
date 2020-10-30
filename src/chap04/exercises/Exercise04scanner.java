package chap04.exercises;

public class Exercise04scanner {
	public static void main(String[] args) {
//		int ran1=0;
//		int ran2=0;
//		while(ran1+ran2!=5) {
//			ran1=(int)(Math.random()*6)+1;
//			ran2=(int)(Math.random()*6)+1;
//			System.out.println(ran1+", "+ran2);
//		}
//		
		
		
		boolean ok = true;
		
		while (ok) {
			int ran = (int)(Math.random()*5) + 1;
			int ran2 = (int)(Math.random()*5) + 1;
			int ran3 = ran + ran2;
			
			System.out.println("첫번째 주사위 값 : " + ran);
			System.out.println("두번째 주사위 값 : " + ran2);
			System.out.println("총합 : " + ran3);			
			
			if (ran == 1) {
				if (ran2 == 4) {
					break;
				}
			}
			if (ran == 4) {
				if (ran2 == 1) {
					break;
				}
			}
			if (ran == 2) {
				if (ran2 == 3) {
					break;
				}
			}
			if (ran == 3) {
				if (ran2 == 2) {
					break;
				}
			}
		}
	}
}

