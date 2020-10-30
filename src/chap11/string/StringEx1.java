package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		// equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6);
		System.out.println(str2.contentEquals(str6));
		
		// indexOf
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("자바");
		System.out.println(a);
		
		// length
		String str8 = "이것이 자바다.      java";
		int b = str8.length();
		System.out.println(str8.charAt(b - 1));
		
		// replace
		String str9 = "abcdefabcefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		
		// substring
		String str11 = "0123456789abcdefg";
		String sub = str11.substring(2, 3);
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6);
		System.out.println(sub);
		
		// trim
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
	}
}
