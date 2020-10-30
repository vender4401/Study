package chap06.lecture.annotation;

public class AnnotationEx1 {
	@MyAnnotation(value="abc", number=13)
	public int i;
	// 주석들..
	
	// annotation
	
	@Override
	@MyAnnotation("abc")
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation
	public static void mymethod() {
		
	}
}

