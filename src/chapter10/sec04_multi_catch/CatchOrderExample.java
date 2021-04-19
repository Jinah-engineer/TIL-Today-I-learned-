package chapter10.sec04_multi_catch;

public class CatchOrderExample {
	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result); 
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다 ㅠ_ㅠ");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample  num1  num2 ");
			
		} catch (Exception e) {
			System.out.println("알지 못하는 예외 발생 ㅠ_ㅠ");
		}
		System.out.println("다시 실행하고 하겐다즈 아이스크림을 먹으세요 :)");
	}
}
