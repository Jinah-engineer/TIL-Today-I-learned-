package chapter09.sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args) {
		// instance member class
		A a = new A();
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
		
		// static member class
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();   
	}
}
