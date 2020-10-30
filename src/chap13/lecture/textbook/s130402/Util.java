package chap13.lecture.textbook.s130402;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	public static <A, B> boolean compare1(Pair<A, B> p3, Pair<A, B> p4) {
		boolean keyCompare = p3.getKey().equals(p4.getKey());
		boolean valueCompare = p3.getValue().equals(p4.getValue());
		return keyCompare && valueCompare;
	}
}
