package chapter08.sec08.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	// method 2 재정의하기 - 자신의 default method로 만들기
	@Override
	default void method2() {
		System.out.println("ChildInterface2 - method2 실행");
	}
	
	public void method3(); // 자신의 메소드만 선언
}
