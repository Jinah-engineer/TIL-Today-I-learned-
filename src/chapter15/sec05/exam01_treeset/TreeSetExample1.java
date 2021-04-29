package chapter15.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		// Set Collection 
		// TreeSet 객체 생성
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(93));
		scores.add(new Integer(80));
		// 저장이 되면서 자동 정렬된다.
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 : " + score);
		
		score = scores.floor(new Integer(95)); // 동등 객체가 있으면 리턴 nor 바로 아래의 객체
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(new Integer(85)); // 동등 객체가 있으면 리턴 nor 바로 아래의 객체
		System.out.println("85점 이거나 바로 위의 점수 : " + score);
		
//		while (!scores.isEmpty()) {
//			score = scores.pollFirst();
//			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
//		}
		
		// 반복자 얻기
		Iterator<Integer> iterator = scores.iterator();
		while (iterator.hasNext()) {
			int s = iterator.next();
			iterator.remove(); // iterator에서는 pollFirst와 달리 remove를 명시적으로 적어야 한다. 
			System.out.println(s);
		}
	}
}
