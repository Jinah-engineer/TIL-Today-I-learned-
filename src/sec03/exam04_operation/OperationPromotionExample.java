package sec03.exam04_operation;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
//		byte byteValue3 = byteValue1 + byteValue2; --> compile error 정수끼리의 연산이기 때문에
		int byteValue3 = byteValue1 + byteValue2;
		System.out.println(byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
//		char charValue3 = charValue1 + charValue2; --> compile error 정수 연산
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 실제값 2.5 
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0; // double 타입으로 정수는 자동 변환 된다.
		double doubleValue6 = intValue5 / 4.0; // double / double 
		System.out.println(doubleValue6);
		
		
		
		
		
	}
}
