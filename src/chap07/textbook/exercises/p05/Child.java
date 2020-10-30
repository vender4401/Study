package chap07.textbook.exercises.p05;

public class Child extends Parent{
	private int studentNo;
	
	
	
	public Child(String name, int studentNo) {
		super(name);
//		this.name = name; // 다른 클래스에 있기 때문에 this. 가 아니라 super()로 가져와야한다.
		this.studentNo = studentNo;
		
	}
}
