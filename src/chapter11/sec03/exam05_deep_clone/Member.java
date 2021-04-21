package chapter11.sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores; // ref type
	public Car car; // ref type - class type field
	
	// 참조 타입을 thin clone 하면 번지만 복제한다.
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// override clone method for deep clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// 먼저 얕은 복사를 해서 name, age를 복제한다 (primitive type)
		Member cloned = (Member) super.clone(); // Object의 clone() 호출
		
		// scores를 깊은 복제한다
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); 
		
		// Car를 깊은 복제한다 
		cloned.car = new Car(this.car.model);
		
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); // 재정의된 clone() 메소드 호출
			
		} catch (CloneNotSupportedException e) {}
		
		return cloned;
	}
}
