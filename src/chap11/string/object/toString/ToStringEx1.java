package chap11.string.object.toString;

public class ToStringEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s1 = o1.toString(); 
		System.out.println(s1);
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2);
	}
}
