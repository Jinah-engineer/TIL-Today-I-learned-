package chapter07.sec07.exam04_array_management;

public class Tire {
	// field
	public int maxRotation; // 타이어의 최대 회전 수 (타이어 수명)
	public int accumulatedRotation; // 타이어의 누적 회전 수 
	public String location; // 타이어의 위치 
	
	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation; // 누적 회전 수 1증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
