package chapter11.sec03.exam02_hashcode;

public class Key {
	// field
	public int number;
	
	// constructor
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		return number; // number가 동일한 Key 객체는 똑같은 hashcode를 갖게 되는 것이다.
		
	}
}
