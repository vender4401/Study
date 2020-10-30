package codingbat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test10261 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("최윤관"); //객체추가
		set.add("최");	//객체추가
		set.add("윤");	//객체추가
		set.add("관");	//객체추가
		
		
		set.remove("윤"); //객체 삭제 (Set 컬렉션은 List처럼 특정 인덱스가 없기 때문에
							//인덱스로 검색해서 가져올수 없다.
							//대신 Iterator(반복자)를 제공함
		System.out.println(set.size());
		Iterator<String> iterator = set.iterator();
		
		
		while(iterator.hasNext()) {	//객체가 없어 질때까지 반복하여 값을 받아온다
			String str = iterator.next(); 
		}
		
		for(String str: set) {	//향상된 for문을 이용 set객체의 값을 str 객체에 담는다.
			
		}
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("최윤관")) {
				iterator.remove();
			}			
		}
		System.out.println(set.size());
		
		
		
		
		
	}
}
