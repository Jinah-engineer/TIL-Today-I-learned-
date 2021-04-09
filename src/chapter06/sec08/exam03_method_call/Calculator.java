package chapter06.sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // plus method 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // avg method 호출
		println("실행결과: " + result);
		}
		
	void println(String message) { // println 호출
		System.out.println(message);
	}
	
}
