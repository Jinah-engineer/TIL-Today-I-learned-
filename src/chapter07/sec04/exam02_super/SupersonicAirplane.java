package chapter07.sec04.exam02_super;

public class SupersonicAirplane extends Airplane{
	// field
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모 메소드 호출 - 반드시 들어갈 필요는 없음
		}
	}
}
