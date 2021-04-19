package chapter09.sec03.exam04_outterclass_ref;

public class Outter {
	// field
	String field = "Outter-field";
	
	// method
	void method() {
		System.out.println("Outter-method");
	}
	
	// inner class
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
