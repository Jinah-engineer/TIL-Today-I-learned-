package chapter03.sec04.exam03_compare;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 = "신용권"; // literal이 같은 객체의 번지를 가지고 있다.
		String strVar2 = "신용권";
		String strVar3 = new String("신용권");
		
		System.out.println(strVar1 == strVar2); // 번지 비교
		System.out.println(strVar1 == strVar3);
		
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		
		
	}
}
