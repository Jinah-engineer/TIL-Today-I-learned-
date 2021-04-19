package chapter09.sec05.exam02_anonymous_implements;

import com.sun.org.apache.bcel.internal.classfile.LocalVariable;

public class Anonymous {
	// field
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	// method
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
