package chapter15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		// Set Collection 
		// TreeSet 객체 생성
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(93));
		scores.add(new Integer(80));
		
		// 내림차순으로 정렬된 Iterator를 리턴
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 오름차순으로 정렬
		NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
		
		for (Integer score : asendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		
		
	}
}
