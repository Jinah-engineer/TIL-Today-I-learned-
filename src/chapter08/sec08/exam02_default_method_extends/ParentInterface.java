package chapter08.sec08.exam02_default_method_extends;

public interface ParentInterface {
	// abstract method
	public void method1();
	
	// default method
	public default void method2() {
		System.out.println("ParentInterface - method2");
	}
}
