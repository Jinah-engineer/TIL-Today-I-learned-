package chapter08.sec08.exam01_why_default_method;

public class DefaultMethodExample {
	public static void main(String[] args) {
		// 변수 선언
		MyInterface mi1 = new MyClassA(); 
		mi1.method1();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
