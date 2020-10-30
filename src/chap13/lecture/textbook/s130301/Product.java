package chap13.lecture.textbook.s130301;


public class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setmodel(M model) {
		this.model = model;
	}
}
