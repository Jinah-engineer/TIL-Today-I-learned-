package chapter09.sec03.exam03_localclass_access;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		// local variable
		final int localVariable = 1;
		
		// local class
		class Inner {
			// method
			void method() {
				int arg = 10;
				int localVariable = 1;
				int result = arg + localVariable;
			}
			// 매개변수와 로컬 변수에 final을 붙이게 되면, local class method 안에 변수를 복사해두고
			// 사용하기 때문에 메소드가 종료되어도 에러가 발생하지 않는다. 
		}
	}
	
	
	// 자바 8 이후
	public void method2(int arg) {
		// local variable
		int localVariable = 1;
		
		// local class
		class Inner {
			// method
			void method() {
				int result = arg + localVariable;
			}
			// 자바 8에서는 변수에 final을 붙이지 않아도 final 특성을 갖는다.
			
		}
	}
}
