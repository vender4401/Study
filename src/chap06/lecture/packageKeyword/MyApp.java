package chap06.lecture.packageKeyword;

import java.util.Scanner;

//import java.lang.String;
// java.lang 키워드는 import 할 필요없다.


public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1
		= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		Scanner scr = new Scanner(System.in);
		String str = "css";
	}
}
