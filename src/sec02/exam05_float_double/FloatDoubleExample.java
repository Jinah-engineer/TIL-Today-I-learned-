package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14; --> Compile error 숫자가 너무 길어서
		float var3 = 3.14F;
		
		// 정밀도 검사
		double var4 = 0.1234567890123456789;
		float var5 = 0.123456789012345689F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		// e 사용하기
		int var6 = 3000000;
//		int var7 = 3e6; --> compile error 지수 부분이 있기 때문에 int에 저장 불가 
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
	}

}
