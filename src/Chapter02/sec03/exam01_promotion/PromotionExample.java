package Chapter02.sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		// 2byte -> 4byte
		System.out.println(intValue);
		
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue = 1000000000000L;
		float floatValue = longValue;
		System.out.println(floatValue); // 부동 소수점 저장 방식이 좀 더 효율적이기 때문에 가능!
		
	}

}
