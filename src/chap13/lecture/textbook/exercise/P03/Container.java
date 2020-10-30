package chap13.lecture.textbook.exercise.P03;

public class Container<T, V> {
	private T tt;
	private V vv;
	
	
	public T getKey() {
		return tt;
	}
	public V getValue() {
		return vv;
	}
	
	public void set(T t, V v) {
		this.tt = t;
		this.vv = v;
	}

}
