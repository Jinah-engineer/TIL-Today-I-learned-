package chapter11.sec04.exam01_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		
		Integer o1 = 1000; // Integer는 클래스 타입! int와 다르다. Integer 객체가 만들어진다. 
		Integer o2 = 1000;
		
		// o1.equals(o2)를 쓰면 되지 않나? --> 매개값이 고정되어있기 때문에, 유연하게 사용하기 어렵다.. 따라서 매개값을 다양하게 주기위해 utility objects를 이용하는 것!
		System.out.println(Objects.equals(o1, o2)); // true
		System.out.println(Objects.equals(o1, null)); // false
		System.out.println(Objects.equals(null, o2)); // false
		System.out.println(Objects.equals(null, null)); // true
		System.out.println(Objects.deepEquals(o1, o2)); // true
		
		
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		
		System.out.println(Objects.equals(arr1, arr2)); // false (번지가 다르기 때문에 - Integer 객체가 생성되었기 때문)
		System.out.println(Objects.deepEquals(arr1, arr2)); // true - Arrays.deepEquals(a,b)가 실행됨. 배열의 항목값만을 비교하기 때문
		System.out.println(Objects.deepEquals(null, arr2)); // false
		System.out.println(Objects.deepEquals(arr1, null)); // false
		System.out.println(Objects.deepEquals(null, null)); // true
		
		
	}
}
