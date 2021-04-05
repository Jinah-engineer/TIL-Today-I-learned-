package chapter03.sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 정수와 실수 비교
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4 == v5); // false
		// float과 double은 정밀도에서 차이나기 때문이다. 
		
		System.out.println((float) v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		
	}

}
