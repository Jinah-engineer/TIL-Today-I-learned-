package Chapter02.sec03.exam03_accuracy;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); // 정밀도 손실 발생 - 근사치 변환 과정에서 값 손실이 생겼기 때문이다.
		
		
	}
}
