package chap11.string.textbook.s110302;

public class Key {
	int number = 0;
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
