package chap05.exercises;

public class Excercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 444, 2, 11, 44, 23};
		
		for(int i = 0; i<5; i++) {
			int a = array[1];
			int b = array[2];
			int c = array[3];
			max = a+b;
			max = c;
		}
		for(int i = 0; i<5; i++) {
			int c = array[3];
			max = c;
		}
		
		for(int i = 0; i<array.length-1; i++) {
			if(array[i] < array[i+1]) {
				max = array[i];
			} 
		}
//		for(int i = 0; i<array.length; i++) {
//			max = (max > array[i]) ? max : array[i];
//		}
		
		
		
		
		System.out.println("max: " + max);
	}
}
