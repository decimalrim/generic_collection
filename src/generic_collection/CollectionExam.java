package generic_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExam {
	
	public static void main(String[] args) {
		
		/**
		 * List 실습
		 */
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		// List에 데이터 추가
//		
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
//		
//		// List에 데이터 조회
//		int score = scoreList.get(0);
//		System.out.println(score);
//		
//		score = scoreList.get(1);
//		System.out.println(score);
//		
//		score = scoreList.get(2);
//		System.out.println(score);
//		
//		score = scoreList.get(3);
//		System.out.println(score);
//		
//		score = scoreList.get(4);
//		System.out.println(score);
		
//		score = scoreList.get(5);
//		System.out.println(score); // java.lang.IndexOutOfBoundsException
		
		// List 반복 데이터 조회
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
//		
//		for(int i = 0; i < scoreList.size(); i++) {
//			score = scoreList.get(i);
//			System.out.println(score);
//		}
		
		// List 데이터 삭제
//		scoreList.remove(3);
//		
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
		
		
		// List 데이터 모두 삭제
//		scoreList.clear();
		
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
		
		// List가 비어있는지 확인
//		System.out.println(scoreList.isEmpty());
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
//		
//		scoreList.clear();
//		
//		System.out.println(scoreList.isEmpty());
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
		
		// 값 존재여부 확인
		
//		if (! scoreList.contains(90)) {
//			scoreList.add(90);
//		}
//		System.out.println(scoreList);
//		System.out.println(scoreList.size());
//		
//		// 리스트 복사
//		List<Integer> scoreList2 = new ArrayList<>();
//		scoreList2.addAll(scoreList);
//		
//		System.out.println(scoreList2);
//		System.out.println(scoreList2.size());
		
		/**
		 * Map 실습
		 */
		
		
		Map<String, Integer> priceMap = new HashMap<>();
		
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		
		// Map에 데이터 추가
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
//		
//		priceMap.put("LG Gram", 1_800_000); // 추가가 아니라 수정된다.
//		
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
		
		// Map에 데이터 조회
//		int applePrice = priceMap.get("Apple Macbook Pro");
//		System.out.println(applePrice);
		
//		int applePrice = priceMap.get("apple Macbook Pro"); //java.lang.NullPointerException
//		System.out.println(applePrice);
		
		// Map에 데이터 삭제
//		priceMap.remove("Apple Macbook Pro");
//		
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
		
		// Map에 데이터 모두 삭제
//		priceMap.clear();
//		
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
		
		// Map에 비어있는지 확인
//		boolean isEmpty = priceMap.isEmpty(); // isEmpty는 null체크부터 꼭하기
//		System.out.println(isEmpty);
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
//		
//		priceMap.clear();
//		
//		isEmpty = priceMap.isEmpty();
//		System.out.println(isEmpty);
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
		
		// Map에 동일한 키 있는지 확인
//		if (!priceMap.containsKey("LG Gram")) {
//			priceMap.put("LG Gram", 1_600_000);
//		}
//		
//		System.out.println(priceMap);
//		System.out.println(priceMap.size());
//		
//		
//		// Map 복사
//		Map<String, Integer> priceMap2 = new HashMap<>();
//		priceMap2.putAll(priceMap);
//		
//		System.out.println(priceMap2);
//		System.out.println(priceMap2.size());
		
		/**
		 * Set 실습
		 */
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		
		// Set에 데이터 추가
		System.out.println(numbers);
		System.out.println(numbers.size()); // 중복데이터 안된다.
		
		// Set 데이터 조회 => Set은 Index로 접근하지 못한다.
		
		for(int n: numbers) {
			System.out.println(n);
		}
		
		// Set 데이터 삭제
//		numbers.remove(10);
//		System.out.println(numbers);
//		System.out.println(numbers.size()); 
		
		// Set 데이터 모두 삭제
//		numbers.clear();
//		System.out.println(numbers);
//		System.out.println(numbers.size()); 
		
		// Set에 동일한 값이 있는지 확인
		if ( ! numbers.contains(20) ) {
			numbers.add(20);
		 }
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		// Set 복사
		Set<Integer> numbers2 = new HashSet<>();
		
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		System.out.println(numbers2.size());
	}

}
