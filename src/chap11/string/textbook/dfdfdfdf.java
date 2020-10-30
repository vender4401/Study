package chap11.string.textbook;

public class dfdfdfdf {
	public static void main(String[] args) {
		String str = "code";
		
		  // String a = str.substring(0, 1);
		  // String b = str.substring(str.length()-1, str.length());
		  
		  // String c = str.replace(a, b);

		  
		  // return c;
		   String a = str.substring(0, 1);
		   String b = str.substring(1, str.length()-1);
		   String c = str.substring(str.length()-1, str.length());
		  
		   String d = c+a;
		   String e = c+b+a;
		   System.out.println(d);
		   
		   if (str.length() <= 1) {
			   System.out.println(str);
		   }
	}

}



