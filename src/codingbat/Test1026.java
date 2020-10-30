package codingbat;

import java.util.ArrayList;
import java.util.List;

public class Test1026 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("최윤관");	//.add로 추가
		list1.add("최");	//.add로 추가
		list1.add("윤");	//.add로 추가
		list1.add("관");	//.add로 추가
		list1.add("Choi");	//.add로 추가
		
		list1.add(2, "yoonkwan");	//지정된 인덱스에 객체 삽입
		
		list1.get(1); 				//지정된 인덱스의 객체 찾기
		System.out.println(list1.get(1));
		
		list1.remove("최");			//객체 삭제
		list1.remove(2);				//인덱스로 객체 삭제
		
	
		for(String str : list1) {		//저장된 객체 수만큼 루핑
			System.out.println(str);
			
		}
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		
		
		
		
		
		
		
		
	}
}
