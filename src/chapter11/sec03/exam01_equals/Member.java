package chapter11.sec03.exam01_equals;

public class Member { // Member는 암시적으로 Object를 상속받는다. 
	// field
	public String id;

	// constructor
	public Member(String id) {
		this.id = id;
	}

	// equal method overriding
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // obj 타입을 Member 타입으로 casting
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
