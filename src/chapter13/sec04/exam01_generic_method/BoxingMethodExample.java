package chapter13.sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// 구체적으로 Integer 타입 명시하기
		Box<Integer> box1 = Util.<Integer> boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		// 타입 파라미터를 String으로 추정
		Box<String>	box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
