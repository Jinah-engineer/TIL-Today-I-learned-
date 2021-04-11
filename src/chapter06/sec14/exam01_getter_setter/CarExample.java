package chapter06.sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		myCar.setStop(false);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		// 초기값을 주지 않았기 때문에 default value 출력
		// setter가 빛을 발할 때 --> 유효성 검사 (올바른 값 입력만 가능하게끔)
	}
}
