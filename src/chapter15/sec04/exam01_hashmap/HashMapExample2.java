package chapter15.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95); // auto boxing
		map.put(new Student(1, "홍길동"), 90); // 위와 동등 객체
		
		System.out.println("총 Entry 수 : " + map.size()); // 1
		
		System.out.println(map.get(new Student(1, "홍길동")));
	}
}
