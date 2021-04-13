package chapter07.sec04.exam02_super;

public class SupersonicAirplanceExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); // 재정의된 메소드
		// 부모의 메소드부터 자식 메소드까지 순서대로 실행
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.land();
	}
}
