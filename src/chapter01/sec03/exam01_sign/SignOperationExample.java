package chapter01.sec03.exam01_sign;

public class SignOperationExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
//		short result3 = -s; --> compile error 부호 연산자가 붙으면 int가 출력되기 때문에
		int result3 = -s;
		System.out.println(result3);
		
		
		
		
		
	}
}
