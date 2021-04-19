package chapter09.sec02.exam01_nestedclass_object;

public class A {
	// constructor
	A(){
		System.out.println("A객체가 생성됨");
	}

	// instance member class
	class B {
		// field
		int field1;
		// static int field2; --> static field는 선언할 수 없다

		// constructor
		B(){
			System.out.println("B 객체가 생성됨");
		}

		// method
		void method1() {

		}
	}
	
	// static member class
	static class C {
		// field
		int field1; 
		static int field2;
		
		// constructor
		C() {
			System.out.println("C 객체가 생성됨");
		}
		
		// method
		void method1() {}
		static void method2() {}
	}
	
	
	// local class
	void method() {
		class D {
			// field
			int field1;
//			static int field2;
			
			// constructor
			public D() {
				System.out.println("D 객체가 생성됨");
			}
			
			// method
			void method1() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
