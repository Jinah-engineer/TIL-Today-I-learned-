package chapter11.sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// data 넣기
		hashMap.put(new Key(1), "홍길동");
		
		// data 찾기
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
		// hashcode 가 먼저 두번 실행 > equals 실행 > 홍길동 실행
		// put과 get에서 각각 hashcode를 받았기 때문이다.	
	}
}
