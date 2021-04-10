package chapter06.sec11.exam01_final;

public class Person {
	// final field declaration
	final String nation = "Korea";
	final String ssn;
	String name;
	
	
	// constructor
	public Person(String ssn, String name) { // 생성자에서 값을 한번만 할당할 수 있다.
		this.ssn = ssn;
		this.name = name;
	}
}
