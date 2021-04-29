package chapter15.sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // 위와 서로 다른 번지를 참조하는 객체 (originally)
		
		System.out.println("총 객체 수 : " + set.size()); // 1 
		
		// 객체는 다르지만, 둘은 내부데이터가  동일하므로 동등객체가 된다.
	}
} 
