package chapter07.sec06.exam01_protected_package1;

public class B {
	public void method() {
		A a = new A();	// A class 호출
		a.field = "value"; // A class field 호출
		a.method(); // A class method 호출
	}
}
