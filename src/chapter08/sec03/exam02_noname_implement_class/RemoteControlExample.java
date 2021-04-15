package chapter08.sec03.exam02_noname_implement_class;

import chapter08.sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		// interface variable
		RemoteControl rc = new RemoteControl() {
			
			private int volume; // 익명 구현 객체 내에서만 사용 가능 - rc로 접근 불가

			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + this.volume);
			}
			public void otherMethod() {/**/} // rc로 접근 불가
		};
	}
}
