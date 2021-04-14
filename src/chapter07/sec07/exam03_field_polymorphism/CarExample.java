package chapter07.sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for (int i = 1; i <= 5; i++) { // Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 자동타입변환
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("------------------------------------"); // 1회전 시 출력되는 내용을 구분
		}
	}
}
