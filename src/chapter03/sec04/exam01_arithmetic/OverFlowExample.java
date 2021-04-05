package chapter03.sec04.exam01_arithmetic;

public class OverFlowExample {

	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y;
		*/
//		System.out.println(z); // 엉터리값이 나오게 된다.
		
		long x = 1000000;
		long y = 1000000;
		
		long z = x * y;
		System.out.println(z); // 올바른 값 
		
	}

}
