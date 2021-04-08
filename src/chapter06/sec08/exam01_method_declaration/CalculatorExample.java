package chapter06.sec08.exam01_method_declaration;

public class CalculatorExample {
	public static void main(String[] args) {
		
	Calculator myCalc = new Calculator(); // 생성자를 통한 instance 호출
	myCalc.powerOn(); // method 호출
	
	int result1 = myCalc.plus(5, 6);  // 외부 parameter를 통한 메소드 사용. int 타입의 method이기 때문에 int 변수에 담아야 한다.
	System.out.println("result1 : " + result1);
	
	byte x = 10;
	byte y = 4;
	double result2 = myCalc.divide(x, y); //  외부 parameter를 통한 메소드 사용. double 타입의 method이기 때문에 double 변수에 담아야 한다.
	System.out.println("result2 : " + result2);
	
}
}
