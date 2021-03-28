package chapter01.sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		
		// 리터럴 간의 연산이기 때문에 가능! 중요
		char c1 = 'A' + 1;
		System.out.println(c1);
		char c2 = 'A';
//		char c3 = c2 + 1; --> c2가 4byte인 int로 변환이 되어서 compile error
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) result;
		System.out.println(c3);
		
		
	}

}
