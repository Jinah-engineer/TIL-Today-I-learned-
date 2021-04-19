package chapter09.sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.wake(); // field의 타입은 Person --> 재정의된 메소드 실행

		anony.method1();

		anony.method2(new Person() {
			String studentNo;

			void study() {
				System.out.println("공부합니다.");
			}

			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
