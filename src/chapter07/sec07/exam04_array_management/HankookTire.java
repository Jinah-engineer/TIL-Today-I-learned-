package chapter07.sec07.exam04_array_management;

public class HankookTire extends Tire{
	// Tire에는 생성자가 있어야 하기 때문에 자식 클래스에서도 반드시 생성자를 생성해줘야 한다. 
	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전 수 1증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
