package sec03.exam02_casting;

public class CastingExample {
	public static void main(String[] args) {
		
		int intValue = 44032;
//		char charValue = intvalue; --> 자동 타입 변환 불가능으로 compile error
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
//		intValue = longValue; --> compile error
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
	}
}
