package chap15.textbook.s150301;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member ) {
			
		Member member = (Member) obj;
		return member.name.contentEquals(this.name) && (member.age==this.age);
		}else {
			return false;
		}
	} 
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
		
	}
}
