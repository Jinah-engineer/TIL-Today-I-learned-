
package chapter08.sec08.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	// default 빼버리고 override 하기 - 추상 메소드 만들기
	@Override
	public void method2();
	
	public void method3(); // 자신의 메소드만 선언
}
