package chapter08.sec08.exam01_why_default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB - method1 실행");
	}
	
	// 구현 클래스에서는 메소드를 재정의 할 때 default 키워드를 붙이지 않는다.
	@Override
	public void method2() {
		System.out.println("MyClassB - method2 실행");
	}
	
}
