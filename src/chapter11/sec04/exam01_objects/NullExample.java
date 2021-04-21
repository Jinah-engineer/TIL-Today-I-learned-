package chapter11.sec04.exam01_objects;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1)); // str1이 null이 아니면 매개값 리턴 
		
		// message off
		try {
			System.out.println(Objects.requireNonNull(str2));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		// message on!
		try {
			System.out.println(Objects.requireNonNull(str2, "이름이 없습니다 ㅠ_ㅠ"));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
		// 람..다..식..
		try {
			System.out.println(Objects.requireNonNull(str2, ()-> "이름이 없습니다 :)"));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		// isNull
		System.out.println(Objects.isNull(str1)); // false
		System.out.println(Objects.isNull(str2)); // true
		
		// nonNull
		System.out.println(Objects.nonNull(str1)); // true
		System.out.println(Objects.nonNull(str2)); // false
		
		
		
		
	}
}
