package chapter11.sec04.exam01_objects;

import java.util.Objects;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class HashCodeExample {
	public static void main(String[] args) {
		
		
	}
	
	// nested static class
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		// overriding hashcode()
		@Override
		public int hashCode() {
			return Objects.hash(sno, name); // 여기서 int는 내부적으로 Integer객체로 변환되게 된다. String은 원래 객체. 그래서 동등 비교가 가능해지는 것이다.
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student s = (Student) obj;
				if (s.name.equals(this.name)) {
					return true;
				}
			}
		return false;
		}
	}
}
