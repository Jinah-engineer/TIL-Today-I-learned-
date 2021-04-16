package chapter08.sec08.exam01_why_default_method;

public interface MyInterface {
	// abstract method
	public void method1();
	
	// abstract method 추가
//	public void method2();	-- > 이렇게 추가하면 MyClassA에서 error가 발생한다. 
	
	// default method로 method2 정의
	public default void method2() {
		System.out.println("MyInterface의 method2 실행"); // 이렇게 하면 error가 사라진다. 
	}
	
}
