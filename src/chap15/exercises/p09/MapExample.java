package chap15.exercises.p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0;	// 최고 점수 저장
		int totalScore = 0;	// 점수 합계 저장
		
		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) { String id =
		 * entry.getKey(); int score = entry.getValue();
		 * 
		 * totalScore += score;
		 * 
		 * if(score > maxScore) { maxScore = score; name = id; }
		 * 
		 * }
		 */
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			int value = map.get(key);
			totalScore += value;
			
			if(value > maxScore) {
				maxScore = value;
				name = key;
			}
		}		
		double avg = (double) totalScore / map.size();
		System.out.println("점수합 : " + totalScore);
		System.out.println("최고값 : " + maxScore);
		System.out.println("최고값 아이디 : " + name);
		System.out.println("평균값 : " + avg);		
	}
}
