package generic_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam {
	
	public static void main(String[] args) {
		
		// List에 데이터 추가
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		// List에 데이터 조회
		int score = scoreList.get(0);
		System.out.println(score);
		
		score = scoreList.get(1);
		System.out.println(score);
		
		score = scoreList.get(2);
		System.out.println(score);
		
		score = scoreList.get(3);
		System.out.println(score);
		
		score = scoreList.get(4);
		System.out.println(score);
		
//		score = scoreList.get(5);
//		System.out.println(score); // java.lang.IndexOutOfBoundsException
		
		// List 반복 데이터 조회
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		for(int i = 0; i < scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);
		}
		
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
		
		if (! scoreList.contains(90)) {
			scoreList.add(90);
		}
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		// 리스트 복사
		List<Integer> scoreList2 = new ArrayList<>();
		scoreList2.addAll(scoreList);
		
		
		
	}

}
