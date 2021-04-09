package chapter06.sec08.exam04_overloading;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10); // param이 하나인 method를 호출한다.
		
		double result2 = myCalc.areaRectangle(10, 20); // param이 2개인 method를 호출한다. 
		
		// int --> double로 자동 형변환 
		
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
		
		
		
	}
}
