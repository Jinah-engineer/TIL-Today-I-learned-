package chapter07.sec07.exam04_array_management;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for (int i = 1; i <= 5; i++) { // Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
			
			if (problemLocation != 0) { // 타이어가 펑크나지 않았을 때
				// problemLocation - 1 = 인덱스번호 (타이어 순번이 1~4이기 때문에)
				System.out.println(car.tires[problemLocation - 1].location + " HankookTire로 교체");
				car.tires[problemLocation - 1] = 
						new HankookTire(car.tires[problemLocation - 1].location, 15); // 자동타입변환
			}
			System.out.println("------------------------------------"); // 1회전 시 출력되는 내용을 구분
		}
	}
}
