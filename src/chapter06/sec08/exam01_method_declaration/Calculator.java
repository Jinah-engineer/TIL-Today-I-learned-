package chapter06.sec08.exam01_method_declaration;

public class Calculator {
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// plus method --> int 타입의 method 
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// divide method --> double 타입의 method
	double divide(int x, int y) { 
		double result = (double) x / (double) y;
		return result;
	}
	
	// 타입 반환이 없는 method
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
