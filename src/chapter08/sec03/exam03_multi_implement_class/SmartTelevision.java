package chapter08.sec03.exam03_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;

	
	// Searchable interface - abstract method에 대한 실체 method
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	
	
	// RemoteControl interface - abstract method에 대한 실체 method
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

}
